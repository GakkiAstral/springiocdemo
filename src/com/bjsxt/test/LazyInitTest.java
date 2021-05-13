package com.bjsxt.test;

import com.bjsxt.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Spring IOC在容器启动后,会把配置的Bean对象全部实例化,实例化3个UsersServiceImpl对象

        //在第一个配置好的Bean对象里面添加lazy-init="true"属性,延迟创建后,会发现只实例化2个UsersServiceImpl对象,等到getBean的时候才会实例化
        System.out.println("——————————————————————");
        UsersService usersService = (UsersService) applicationContext.getBean("usersService");
    }
}
