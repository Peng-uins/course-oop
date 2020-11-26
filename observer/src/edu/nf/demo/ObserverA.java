package edu.nf.demo;

/**
 * @author 0.0
 */
public class ObserverA implements Observer {

    @Override
    public void doSomething(String message) {
        System.out.println("ObserverA处理消息："+message);
    }
}
