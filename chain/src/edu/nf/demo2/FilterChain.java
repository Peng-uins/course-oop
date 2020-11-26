package edu.nf.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author 0.0
 *
 */
public class FilterChain {


    private Iterator<Filter> iterator ;

    /**
     * 在过滤方法中初始化所有过滤器，并存入集合中
     */
    public FilterChain() {
       /* List<Filter> filters = new ArrayList<>();
        Filter filterA = new FliterA();
        Filter filterB = new FilterB();
        Filter filterC = new FilterC();
        filters.add(filterA);
        filters.add(filterB);
        filters.add(filterC);*/
        List<Filter> filters = initFilters();
        //排序
        sort(filters);
        //从集合中获取迭代器,for循环的内部就是用迭代器去迭代的
        iterator = filters.iterator();
    }

    /**
     * 解析初始化所有的过滤器
     */
    public List<Filter> initFilters(){
        List<String> classesName = ScanUtils.scanPackage();
        List<Filter> filters = new ArrayList<>();
        //循环遍历带有WebFilter注解的类
        classesName.forEach(s->{
            try {
                Class<?> clazz = Class.forName(s);
                if(clazz.isAnnotationPresent(WebFilter.class)){
                    //将Filter实例化创建并保存到List中
                    filters.add((Filter) clazz.newInstance());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return filters;
    }

    /**
     * 排序
     * @param list
     */
    private void sort(List<Filter> list){
        Collections.sort(list,(list1,list2)->{
            Integer order1 = list1.getClass().getAnnotation(WebFilter.class).order();
            Integer order2 = list2.getClass().getAnnotation(WebFilter.class).order();
            return order1.compareTo(order2);
        });
    }

    public void doExecute(HttServlertequest req, HttServlerteResponse resp){
        //放行的操作
        //先判断是否有下一个过滤器
        if(iterator.hasNext()){
            //取出下一个过滤器
            Filter filter = iterator.next();
            //执行filter的doFilter方法处理请求
            //每一个过滤器都需要用到FilterChain这个对象，因此，doFilter方法就是将当前对象（FilterChain）
            //传递给过滤器
            filter.doFilter(req,resp,this);
        }
    }
}
