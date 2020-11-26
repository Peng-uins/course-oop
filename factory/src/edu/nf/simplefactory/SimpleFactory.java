package edu.nf.simplefactory;

import edu.nf.item.Phone;
import edu.nf.item.impl.ApplePhone;
import edu.nf.item.impl.MiPhone;

/**
 * @author 0.0
 * 简单工厂
 */
public class SimpleFactory {

    /**
     *
     * @param name 产品的名称
     * @return
     */
    public static Phone build(String name){
        Phone phone = null;
        if("apple".equals(name)){
            phone = new ApplePhone();
        }else if("mi".equals(name)){
            phone = new MiPhone();
        }
        return phone;
    }
}
