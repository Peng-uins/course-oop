package edu.nf.dome3.impl;

import edu.nf.dome3.ServiceInf;

/**
 * @author 0.0
 */
public class UsersServiceImpl implements ServiceInf {

    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void get() {
        System.out.println("查询用户");
    }
}
