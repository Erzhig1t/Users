package com.company.Service;

import com.company.Model.User;

public interface UserService {

    void saveUser(User user);
    User findWithId(long id);
    User[] deleteWithId(long id);
    User[] getAllUsers();
}
