package edu.nf.methodFactory.impl;

import edu.nf.item.Phone;
import edu.nf.item.impl.ApplePhone;
import edu.nf.methodFactory.AbstractFactory;

public class ApplePhoneFactory implements AbstractFactory {
    @Override
    public Phone build() {
        return new ApplePhone();
    }
}
