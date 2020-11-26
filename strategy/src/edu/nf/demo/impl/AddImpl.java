package edu.nf.demo.impl;

import edu.nf.demo.Calculator;

import java.math.BigDecimal;

public class AddImpl implements Calculator {

    @Override
    public BigDecimal cal(BigDecimal numa, BigDecimal numb) {
        //add就某一个数加上另一个数，加法计算
        return numa.add(numb);
    }
}
