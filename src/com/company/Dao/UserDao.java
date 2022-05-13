package com.company.Dao;

import com.company.Model.User;

public class UserDao {
    private User[] users = new User[3];

    public UserDao(User[] users) {
        this.users = users;
    }

    public UserDao() {
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
