package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUser(Long id);
}
