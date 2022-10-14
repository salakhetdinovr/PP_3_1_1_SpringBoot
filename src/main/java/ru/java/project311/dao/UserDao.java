package ru.java.project311.dao;



import ru.java.project311.model.User;

import java.util.List;

public interface UserDao {

    List<User> listUsers();
    void createUser(User user);
    void removeUser(User user);
    User getUserById(int id);
    void updateUser(User user);
}
