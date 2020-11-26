package edu.nf.abstractFactory.impl;

import edu.nf.abstractFactory.AbstractFactory;
import edu.nf.item.Pad;
import edu.nf.item.Phone;
import edu.nf.item.impl.ApplePad;
import edu.nf.item.impl.ApplePhone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone buildPhone() {
        return new ApplePhone();
    }

    @Override
    public Pad buildPad() {
        return new ApplePad();
    }
}
