package edu.nf.demo1;

/**
 * @author 0.0
 * 代理对象
 * 静态代理(简单)，编译期已经完成代理
 *
 * 动态代理，在运行时产生的代理
 */
public class AcerProxy implements PcFactory {

    /**
     * 目标厂商
     */
    private PcFactory pcFactory;


    public AcerProxy(PcFactory pcFactory) {
        this.pcFactory = pcFactory;
    }

    @Override
    public void sell(int money) {
        int a = before(money);
        //同构造方法获取厂商，然后把本金给厂商
        //调用目标对象的方法
        pcFactory.sell(a);
        //指定after方法
        after();
    }

    /**
     * before方法里面执行利润扣除业务
     * @param money
     * @return
     */
    private int before(int money){
        System.out.println("Acer代理销售价格："+money);
        //扣除利润
        int i = money - 1000;
        System.out.println("获取利润:"+i);
        //将本金交付给厂商
        int a = money - i;
        return a;
    }

    /**
     * 调用目标方法之后实行的业务逻辑
     */
    private void after(){
        System.out.println("售后服务....");
    }
}
