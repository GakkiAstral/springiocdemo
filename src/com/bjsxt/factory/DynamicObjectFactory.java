package com.bjsxt.factory;

import com.bjsxt.service.UsersService;
import com.bjsxt.service.impl.UsersServiceImpl;

public class DynamicObjectFactory {
    public UsersService getInstance(){
        return new UsersServiceImpl();
    }
}
