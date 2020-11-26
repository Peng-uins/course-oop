package edu.nf.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 0.0
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private Iterator<Filter> iterator;

    public FilterChain() {
    }

    public void doExecute(HttpServlertequest req, HttpServletResponse resp){
        if(iterator.hasNext()){
            Filter filter = iterator.next();
            filter.doFilter(req,resp,this);
        }
    }
    public void list(){
        List<String> stu =  ScanUtils.scanPackage();
        stu.forEach(s->{
            try {
                Class<?> clazz = s.getClass();
                if(clazz.isAnnotationPresent(Bean.class)){
                    filters.add((Filter) clazz.newInstance());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
