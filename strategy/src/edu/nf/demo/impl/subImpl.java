package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class subImpl implements Calculator {
    @Override
    public BigDecimal cal(BigDecimal numa, BigDecimal numb) {
        //减法
        return numa.subtract(numb);
    }
}
