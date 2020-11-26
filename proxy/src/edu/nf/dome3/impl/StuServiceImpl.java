package edu.nf.dome3.impl;

import edu.nf.dome3.ServiceInf;

/**
 * @author 0.0
 */
public class StuServiceImpl implements ServiceInf {
    @Override
    public void add() {
        System.out.println("添加学生");
        //记录日志
        //System.out.println("记录操作日志");
    }

    @Override
    public void update() {
        System.out.println("修改学生");
    }

    @Override
    public void get() {
        System.out.println("查询学生");
    }
}
