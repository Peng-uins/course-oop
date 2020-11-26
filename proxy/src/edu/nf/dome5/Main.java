package edu.nf.dome5;

import org.evergreen.aop.core.ProxyBuilder;

public class Main {
    public static void main(String[] args) {
        //创建一个代理生成器
        ProxyBuilder builder = new ProxyBuilder(StuService.class);
        //创建代理实例
        StuService proxy =  builder.createProxy();
        proxy.add();
        proxy.update();

    }
}
