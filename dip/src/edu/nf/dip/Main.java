package edu.nf.dip;

import edu.nf.dip.impl.StuDaoImpl;
import edu.nf.dip.impl.UserDaoImpl;

public class Main {

    public static void main(String[] args) {

        UserDao dao = new StuDaoImpl();
        UserService s = new UserService();
        s.setUserDao(dao);
        s.add();
    }
}
