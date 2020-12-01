package edu.nf.lsp;

/**
 * @author 0.0
 * 里氏替换原则，父类可以被子类替换实现操作，不会影响程序的正确性
 */
public class Main {

    public static void main(String[] args) {
        Rectangle r = new Square();
        r.setWidth(10);
        r.setHeight(20);
        System.out.println(r.area());
    }
}
