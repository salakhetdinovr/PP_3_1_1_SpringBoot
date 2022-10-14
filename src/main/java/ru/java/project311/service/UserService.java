package ru.java.project311.service;



import ru.java.project311.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
    void removeUser(User user);
    User getUserById(int id);
    void updateUser(User user);
}
