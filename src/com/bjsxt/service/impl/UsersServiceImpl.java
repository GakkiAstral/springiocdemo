package com.bjsxt.service.impl;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UsersServiceImpl implements UsersService {
    private UsersDao usersDao;
    private String username;
    private int userage;

    private List<String> list;
    private List<Users> users;

    private Set<Users> usersSet;

    private Map<String,String> map;
    private Map<String,Users> usersMap;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;

    public void setUsersMap(Map<String, Users> usersMap) {
        this.usersMap = usersMap;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setUsersSet(Set<Users> usersSet) {
        this.usersSet = usersSet;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public UsersServiceImpl(UsersDao usersDao){
        this.usersDao = usersDao;
    }

    public UsersDao getUsersDao() {
        return usersDao;
    }

    public void setUsersDao(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public UsersServiceImpl() {
        System.out.println("UsersServiceImpl 初始化构造方法被调用！");
    }

    @Override
    public void addUsers() {
        System.out.println(this.username+"\t"+this.userage);
        list.forEach(System.out::println);
        users.forEach(System.out::println);
        usersSet.forEach(System.out::println);
        for (Map.Entry<String,String> entry:this.map.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        for (Map.Entry<String,Users> entry:this.usersMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        String value1 = this.properties.getProperty("pro1");
        String value2 = this.properties.getProperty("pro2");
        System.out.println(value1 + "\t" + value2);
        usersDao.insertUsers();
        //System.out.println("UsersService addUsers被调用！");
    }
}
