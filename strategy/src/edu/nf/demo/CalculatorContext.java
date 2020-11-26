package edu.nf.demo;

import edu.nf.demo.impl.AddImpl;
import edu.nf.demo.impl.DivImpl;
import edu.nf.demo.impl.MultiImpl;
import edu.nf.demo.impl.subImpl;

import javax.security.auth.Subject;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

/**
 * @author 0.0
 * 策略上下文
 * 核心作用就是根据客户段的需求，来创建和调用具体的策略实现类
 */
public class CalculatorContext {

    /**
     * 计算器接口
     */
    private  Calculator c;

    /**
     * 构造方法
     * @param option 选择参数有客户端提供
     *  例如当option的值为add时，表示要执行加法计算
     *
     */
    public  CalculatorContext(String option){
        /*if("add".equals(option)){
            c = new AddImpl();
        }else if("sub".equals(option)){
            c = new subImpl();
        }else if("multi".equals(option)){
            c = new MultiImpl();
        }else if("div".equals(option)){
            c = new DivImpl();
        }else{
            throw new RuntimeException("暂不支持此计算");
        }*/

        //创建Properties对象,去读取配置文件
        Properties prop = new Properties();
        try {
            //加载资源文件,从加载器里面去加载输入流
            prop.load(CalculatorContext.class.getClassLoader().getResourceAsStream("calculator.properties"));
            //根据传入的参数名获取对应的值
            String className = prop.getProperty(option);
            //根据完整的类名创建实例
            c = (Calculator) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CalculatorContext() {

    }

    /**
     * 封装了实现类方法的调用
     * @param numA
     * @param numB
     * @return
     */
    public BigDecimal cal(BigDecimal numA,BigDecimal numB){
        return c.cal(numA,numB);
    }
}
