package edu.nf.methodFactory.impl;

import edu.nf.item.Phone;
import edu.nf.item.impl.MiPhone;
import edu.nf.methodFactory.AbstractFactory;

/**
 * @author 0.0
 */
public class MiPhoneFactory implements AbstractFactory {
    @Override
    public Phone build() {
        return new MiPhone();
    }
}
