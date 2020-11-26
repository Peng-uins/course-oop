package edu.nf.demo1;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        //创建代理
        AcerProxy proxy = new AcerProxy(new AcerFactory());
        proxy.sell(2500);
    }
}
