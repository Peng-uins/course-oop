package edu.nf.superFactory;

/**
 * @author 0.0
 * 超级工厂结合反射完成
 */
public class ObjectFactory {
    //泛型T代表type的缩写
    public static <T> T build(String className) {
        Object o = null;
        try {
            //Class<?> clazz = Class.forName(className);
            o = Class.forName(className).newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) o;
    }
}
