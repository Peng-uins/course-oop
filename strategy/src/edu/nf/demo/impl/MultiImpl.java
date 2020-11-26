package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class MultiImpl implements Calculator {
    @Override
    public BigDecimal cal(BigDecimal numa, BigDecimal numb) {
        //乘法计算
        return numa.multiply(numb);
    }
}
