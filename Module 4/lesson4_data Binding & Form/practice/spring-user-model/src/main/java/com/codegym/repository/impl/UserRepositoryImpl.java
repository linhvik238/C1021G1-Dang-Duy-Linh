package com.codegym.repository.impl;

import com.codegym.model.Login;
import com.codegym.model.User;
import com.codegym.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(25);
        u1.setName("Anh Hoàng");
        u1.setAccount("anhhoang");
        u1.setEmail("anhhoang@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(27);
        u2.setName("Duy Bểu");
        u2.setAccount("duybao");
        u2.setEmail("duybao@gmail.com");
        u2.setPassword("123123");
        users.add(u2);

        User u3 = new User();
        u3.setAge(27);
        u3.setName("Duy Thựn");
        u3.setAccount("duythun");
        u3.setEmail("duythun@gmail.com");
        u3.setPassword("654321");
        users.add(u3);
    }

    public User checkLogin (Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
