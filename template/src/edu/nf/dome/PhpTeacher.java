package edu.nf.dome;

/**
 * @author 0.0
 */
public class PhpTeacher extends Teacher {
    @Override
    public void lesson() {
        System.out.println("上PHP课程");
    }

    @Override
    public void homework() {
        System.out.println("布置PHP作业");
    }
}
