package edu.nf.dome;

/**
 * @author 0.0
 */
public class Main {

    public static void main(String[] args) {
        Teacher teacher = new JavaTeacher();
        //模板方法在方法里面确定好细节顺序
        teacher.doWork();

        Teacher teacher1 = new EnglishTeacher();
        //模板方法在方法里面确定好细节顺序
        teacher1.doWork();
    }
}
