package edu.nf.demo2;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        //创建消息队列,这个消息队列是共用的
        MessageBroker broker = new MessageBroker();
        //创建订阅者
        Consumer c = new Consumer(broker);
        //创建发布者
        Producer p = new Producer(broker);
        //发布消息
        p.publish("Hello world");
        //订阅消息
        c.subscribe();
    }
}
