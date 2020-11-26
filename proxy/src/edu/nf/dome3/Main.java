package edu.nf.dome3;

import edu.nf.dome3.impl.UsersServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        ServiceInvocationHandler handler = new ServiceInvocationHandler(new UsersServiceImpl());
        ServiceInf proxy = (ServiceInf)Proxy.newProxyInstance(Main.class.getClassLoader(),UsersServiceImpl.class.getInterfaces(),handler);
        proxy.add();
        proxy.update();
        proxy.get();

    }
}
