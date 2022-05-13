package com.company;

import com.company.Dao.UserDao;
import com.company.Impl.UserServiceImpl;
import com.company.Model.User;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        User user1 = new User(1, "Asan", 25);
        User user2 = new User(2, "Marat", 23);
        User user3 = new User(3, "Talant", 27);

        UserServiceImpl userService = new UserServiceImpl();
        userService.saveUser(user1);
        userService.saveUser(user2);
        userService.saveUser(user3);

        System.out.println("*****************************************");

        int id = 1;
        System.out.println("There is found a user with " + id);
        User user = userService.findWithId(id);
        if (id != 1) {
            throw new MyException();
        }
        if (user == null) {
            throw new MyException("There is no user with this id");
        } else {
            System.out.println(user);
            System.out.println("*******************************************");
        }
        int id2 = 2;
        Object object =  userService.deleteWithId(id2);
        if(object==null){
            System.out.println("There is no user with this"+ " " + id2);
        }else {
            System.out.println(object);
        }

        System.out.println("************************************************");
        for (User us : userService.getAllUsers()) {
            if (us != null) {
                System.out.println(us);
                }
            }
    }
}

