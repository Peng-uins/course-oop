package edu.nf.containerfactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 0.0
 */
public class ContainerFactory {

    //定义一个呃呃容器
    private Map<String ,Object> container = new HashMap<>();

    public ContainerFactory(){
        //执行类扫描,得到所有类的完整类名
        List<String> classesName = ScanUtils.scanPackage();
        //执行类解析，将带有注解的Class精选初始化并保存到容器中
        resolveClass(classesName);
    }

    /**
     * 解析class，找到@Bean注解的类，并创建实例保存到map集合中
     * @param classesName
     */
    private void resolveClass(List<String> classesName){
        classesName.forEach(className -> {
            try {
                //类加载
                Class<?> clazz =  Class.forName(className);
                //解析注解，需要创建实体类的都加上注解了
                if(clazz.isAnnotationPresent(Bean.class)){
                    //获取注解的value属性的值，也就是别名，就是Bean注解上面的名字
                    String value = clazz.getAnnotation(Bean.class).value();
                    //将别名作为key（这个别名就是Bean设置的别名这个别名和扫描到的名字是一样的），class创建出来的实例错位欸value保存到map中
                    container.put(value,clazz.newInstance());//clazz创建实体类
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * 提供一个从容器获取Bean对象的方法
     * @param name 对应容器中的key
     * @param <T>
     * @return
     */
    public <T> T getBean(String name){
        return (T)container.get(name);
    }
}
