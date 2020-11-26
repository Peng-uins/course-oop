package edu.nf.demo;

import java.math.BigDecimal;

/**
 * @author 0.0
 */
public interface Calculator {

    /**
     * 金额数字计算数据库都要使用decimal类型
     * BigDecimal大精度类型,不会产生数据丢失
     * 抽象的计算方法
     * @param numa
     * @param numb
     * @return
     */
    BigDecimal cal(BigDecimal numa,BigDecimal numb);
}
