package edu.nf.dome;

/**
 * @author 0.0
 */
public abstract class Teacher {

    public void call(){
        System.out.println("上课点名");
    }

    public void otherWork(){
        System.out.println("其他工作");
    }

    public abstract void lesson();

    public abstract void homework();

    /**
     * 声明一个模板，将步骤细节封装
     */
    public void doWork(){
        call();
        lesson();
        homework();
        //当钩子方法执行返回true的时候才回调用可选方法
        if (hock()) {
            otherWork();
        }
    }

    /**
     * 钩子方法，可以让子类重写来剔除不需要参与的步骤
     */
    public boolean hock(){
        return true;
    }
}
