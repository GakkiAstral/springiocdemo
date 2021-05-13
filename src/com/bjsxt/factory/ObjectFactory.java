package com.bjsxt.factory;

import com.bjsxt.service.UsersService;
import com.bjsxt.service.impl.UsersServiceImpl;

public class ObjectFactory {
    //这里是static 不管调用多少次getInstance的方法，都只会产生一个UsersService
    public static UsersService getInstance(){
        return new UsersServiceImpl();
    }
}
