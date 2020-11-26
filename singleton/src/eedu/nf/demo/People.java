package eedu.nf.demo;

/**
 * @author 0.0
 * 饿汉式
 */
public class People {

    /**
     * 创建一个自身类的实例
     */
    private static People instance = new People();

    /**
     * 将构造方法私有化
     */
    private People(){
    }

    public void say(){
        System.out.println("adsds");
    }

    /**
     * 获取本类实例的静态方法给外部访问
     * @return
     */
    public  static People getInstance(){
        return instance;
    }
}
