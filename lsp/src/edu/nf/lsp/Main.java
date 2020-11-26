package edu.nf.lsp;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        Rectangle r = new Square();
        r.setWidth(10);
        r.setHeight(20);
        System.out.println(r.area());
    }
}
