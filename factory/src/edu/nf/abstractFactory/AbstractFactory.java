package edu.nf.abstractFactory;

import edu.nf.item.Pad;
import edu.nf.item.Phone;
import edu.nf.item.impl.ApplePad;

/**
 * @author 0.0
 */
public interface AbstractFactory {
    Phone buildPhone();
    Pad buildPad();
}
