package com.bjsxt.dao.impl;

import com.bjsxt.dao.UsersDao;

public class UsersDaoMybatisImpl implements UsersDao {
    @Override
    public void insertUsers() {
        System.out.println("Mybatis……insert into!");
    }
}
