package com.spring.mvc.dao;

import com.spring.mvc.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUser();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
