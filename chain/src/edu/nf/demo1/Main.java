package edu.nf.demo1;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        //创建所以的任务处理者
        AbstractHandler handlerA = new HandlerA();
        AbstractHandler handlerB = new HandlerB();
        AbstractHandler handlerC = new HandlerC();
        //装配执行链
        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);
        //执行任务链,从任务链中的第一个任务处理者开始
        handlerA.execute(20000);
    }

}
