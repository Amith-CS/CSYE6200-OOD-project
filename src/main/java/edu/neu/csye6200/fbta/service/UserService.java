package edu.neu.csye6200.fbta.service;

import edu.neu.csye6200.fbta.model.User;

public interface UserService {

    User createUser(User user);

    void deleteUser(int userId);

    User updateUser(int userId, User user);

    User getUserById(int userId);
}
