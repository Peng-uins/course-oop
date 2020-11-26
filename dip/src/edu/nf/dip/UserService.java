package edu.nf.dip;

import edu.nf.dip.impl.UserDaoImpl;

public class UserService {


    private UserDao dao;

    public void setUserDao(UserDao dao) {
        this.dao = dao;
    }

    public void add(){
        dao.save();
    }
}
