package com.company.Impl;

import com.company.Dao.UserDao;
import com.company.Model.User;
import com.company.Service.UserService;

import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();
    private int index;
    private int id;

    public UserServiceImpl() {
    }

    @Override
    public void saveUser(User user) {
        if(index!=userDao.getUsers().length) {
            if (user != null) {
                userDao.getUsers()[index] = user;
                index++;
                System.out.println(user.getName()+" is successfully has been registered.");
            } else {
                System.out.println("Something is wrong. Please, try again.");
            }
        }else {
            System.out.println("There is no memory to save.");
        }
    }

    @Override
    public User findWithId(long id) {
        for (User user : userDao.getUsers()) {
            if (user != null) {
                if (user.getId() == id) {
                     return user;
                }
            }
        }
         return null;
    }

    @Override
    public User[] deleteWithId(long id) {
        for (int i = 0; i < userDao.getUsers().length; i++) {
            if(userDao.getUsers()[i]==null){
                System.out.println("There is no user with id "+id+"in date base>");
                break;
            }
            if(userDao.getUsers()[i].getId()==id){
                System.out.println(userDao.getUsers()[i]==null);
                System.out.println("User with id: " + id+ " has been successfully deleted");
                break;
            }
        }
        return null;
    }

    @Override
    public User[] getAllUsers() {
        return userDao.getUsers();
    }

    @Override
    public String toString() {
        return "UserServiceImpl{}";
    }
}
