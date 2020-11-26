package edu.nf.dome;

public class JavaTeacher extends Teacher {
    @Override
    public void lesson() {
        System.out.println("上Java课");
    }

    @Override
    public void homework() {
        System.out.println("布置Java作业");
    }
}
