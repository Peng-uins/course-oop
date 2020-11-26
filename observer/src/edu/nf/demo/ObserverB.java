package edu.nf.demo;

/**
 * @author 0.0
 */
public class ObserverB implements Observer {

    @Override
    public void doSomething(String message) {
        System.out.println("ObserverB处理消息：" + message);
    }
}
