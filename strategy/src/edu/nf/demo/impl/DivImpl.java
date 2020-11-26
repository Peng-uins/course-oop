package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class DivImpl implements Calculator {
    @Override
    public BigDecimal cal(BigDecimal numa, BigDecimal numb) {
        //除法计算
        return numa.divide(numb);
    }
}
