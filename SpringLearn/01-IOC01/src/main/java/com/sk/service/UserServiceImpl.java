package com.sk.service;

import com.sk.dao.UserDao;
import com.sk.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    //旧方法 直接在后台程序中new死对象
    // private UserDao userDao = new UserDaoImpl();

    //IOC原理
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void add() {
        userDao.add();
    }
}
