package edu.nf.demo;

import edu.nf.demo.impl.AddImpl;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
     /*   Calculator calculator = new AddImpl();
        //先要获取BigDecimal存值在放入方法中
        BigDecimal numA = new BigDecimal("3.5");
        BigDecimal numB = new BigDecimal("2.7");
        //可以将结果转换为duoble的类型,打点可以转换为任意的基本类型
        System.out.println(calculator.cal(numA,numB).doubleValue());
        //System.out.println(calculator.cal(numA,numB).longValue());*/

        BigDecimal numA = new BigDecimal("5");
        BigDecimal numB = new BigDecimal("2");
        //创建策略上下文
        CalculatorContext c = new CalculatorContext("div");
        BigDecimal result = c.cal(numA,numB);
        System.out.println(result);


    }
}
