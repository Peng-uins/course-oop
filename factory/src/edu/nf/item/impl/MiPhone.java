package edu.nf.item.impl;

import edu.nf.containerfactory.Bean;
import edu.nf.item.Phone;

/**
 * @author 0.0
 */
@Bean("MiPhone")
public class MiPhone extends Phone {

    @Override
    public void call() {
        System.out.println("使用小米手机打电话");
    }

    @Override
    public void message() {
        System.out.println("使用小米手机发短信");
    }
}
