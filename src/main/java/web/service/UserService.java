package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();

    User getUser(Long id);

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);
}
