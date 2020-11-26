package edu.nf.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.LinkedList;

/**
 * @author 0.0
 * 链接对象回调处理器
 * 在回调处理器中监听close方法
 * 如果客户端调用的是close，那么就将连接对象放回连接池
 * 否则其他的方法则正常调用
 */
public class IinkInvocationHandler implements InvocationHandler {

    private LinkedList<Connection> pool;
    private Connection target;

    public IinkInvocationHandler(LinkedList<Connection> pool, Connection target) {
        this.pool = pool;
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("close".equals(method.getName())){
            //将链接放回链接池（注意：是被代理过的链接对象）
            pool.addLast((Connection) proxy);
            return null;
        }else{
            return method.invoke(target,args);
        }
    }
}
