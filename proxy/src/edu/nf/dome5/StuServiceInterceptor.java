package edu.nf.dome5;

import org.evergreen.aop.annotation.Around;
import org.evergreen.aop.core.InvocationContext;

import javax.xml.ws.Action;

/**
 * @author 0.0
 * 代理拦截器
 * 负责调用目标对象方法
 */
public class  StuServiceInterceptor {

    /**
     * 回调方法
     * @param ic 回调上下文对象，负责调用目标对象的方法
     */
    @Around
    public void log(InvocationContext ic) throws Throwable{
        //调用目标对象的方法
        ic.proceed();
        System.out.println("记录操作日志");
    }
}
