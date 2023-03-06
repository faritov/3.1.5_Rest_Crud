package com.example.REST.dao;

import com.example.REST.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void createUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    User showUser(int id);

    UserDetails getUser(String email);
    User getUserEmail(String email);
}
