package edu.nf.dip;

import edu.nf.dip.impl.StuDaoImpl;

/**
 * @author 0.0
 * 依赖倒置原则，高层不依赖底层，两者要依赖抽象，抽象不依赖实体，但是实体要依赖抽象
 */
public class Main {

    public static void main(String[] args) {

        UserDao dao = new StuDaoImpl();
        UserService s = new UserService();
        s.setUserDao(dao);
        s.add();
    }
}
