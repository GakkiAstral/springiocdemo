package com.bjsxt.test;

import com.bjsxt.service.UsersService;
import com.bjsxt.service.impl.UsersServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsersServiceTest {
    public static void main(String[] args) {
        /*UsersService usersService = new UsersServiceImpl();
        usersService.addUsers();*/

        //启动Spring IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC容器中获取对象,通过name
        /*UsersService usersService = (UsersService) applicationContext.getBean("name3");
        usersService.addUsers();*/

        //从IOC容器中获取对象,通过类型获取Bean对象
        //单独使用类型获取Bean对象的话,需要确认获取到的UsersServiceImpl类型是唯一的,要把applicationContext.xml配置文件中的其他Bean注释了
        /*UsersService usersService = applicationContext.getBean(UsersServiceImpl.class);
        usersService.addUsers();*/

        //根据id区别获取指定的对象,方式一
        /*UsersService usersService1 = applicationContext.getBean("usersService",UsersServiceImpl.class);
        usersService1.addUsers();*/

        //根据name区别获取指定的对象,方式一
        /*UsersService usersService2 = applicationContext.getBean("name1",UsersServiceImpl.class);
        usersService2.addUsers();*/

        //获取Spring IOC容器中所有Bean对象的ID,方式二
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String str :beanDefinitionNames) {
            System.out.println(str);
        }
        UsersService usersService = applicationContext.getBean(beanDefinitionNames[0],UsersServiceImpl.class);
        usersService.addUsers();
    }
}
