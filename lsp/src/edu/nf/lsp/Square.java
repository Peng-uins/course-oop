package edu.nf.lsp;

/**
 * @author 0.0
 */
public class Square extends Rectangle {

    /*@Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }*/

    /**
     * 遵循里氏替换原则，不应该覆盖父类默认行为，但可以在子类增加自己的新的行为方法
     * @param side
     */
    public void serSide(int side){
        this.width = side;
        this.height = side;
    }
}
