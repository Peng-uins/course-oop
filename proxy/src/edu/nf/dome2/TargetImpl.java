package edu.nf.dome2;

/**
 * @author 0.0
 * 目标对象（也就是被代理对象）
 */

public class TargetImpl implements DemoInf {

    @Override
    public void todo(String name) {
        System.out.println("执行业务逻辑操作" + name);
    }
}
