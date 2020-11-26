package edu.nf.dome4;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 0.0
 * 拦截器，类似于jdk动态代理的InvocationHandler
 */
public class UserServiceInvocationHandler implements MethodInterceptor {

    /**
     *
     * @param proxy 运行时创建的代理对象
     * @param method 目标对象正在调用的方法
     * @param args 目标对象方法所需要的参数
     * @param methodProxy 目标的对象方法的代理实力
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        //由于动态创建的代理对象是一个子类，因此调用目标的方法（也就是父类）使用  methodProxy.invokeSuper()
        Object returnVal =  methodProxy.invokeSuper(proxy,args);
        after();
        return returnVal;
    }

    private void before(){
        System.out.println("before...");
    }
    private void after(){
        System.out.println("after...");
    }
}
