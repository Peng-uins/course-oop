package eedu.nf.demo;

/**
 * @author 0.0
 * 懒汉式
 */
public class Student{

    private static Student instance;
    private static String key ="key";

    private Student() {

    }

    /**
     * 单线程每问题，但是多线程会出错，多线程访问时间不够
     * @return
     * 懒汉的双重校验，防止多线程的情况下多次创建实例
     */
    public static Student getInstance(){
        if(instance == null){
            //只有一把钥匙访问完下一个人才能访问
            synchronized (key){
                if(instance == null){
                    instance = new Student();
                }
            }
        }
        return instance;
    }

    public void say(){
        System.out.println("dsadsa");
    }
}
