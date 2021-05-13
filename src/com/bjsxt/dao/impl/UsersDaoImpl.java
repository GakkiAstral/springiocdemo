package com.bjsxt.dao.impl;

import com.bjsxt.dao.UsersDao;

public class UsersDaoImpl implements UsersDao {
    @Override
    public void insertUsers() {
        System.out.println("JDBC:insert into!");
    }
}
