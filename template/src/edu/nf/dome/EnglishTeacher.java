package edu.nf.dome;

/**
 * @author 0.0
 */
public class EnglishTeacher extends Teacher {
    @Override
    public void lesson() {
        System.out.println("上英语课");
    }

    @Override
    public void homework() {
        System.out.println("布置英语作业");
    }

    /**
     * 重写hock方法，返回false，即可剔除otherWork
     * @return
     */
    @Override
    public boolean hock() {
        return false;
    }
}
