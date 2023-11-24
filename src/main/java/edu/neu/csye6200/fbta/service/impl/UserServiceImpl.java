package edu.neu.csye6200.fbta.service.impl;

import edu.neu.csye6200.fbta.model.User;
import edu.neu.csye6200.fbta.repository.UserRepository;
import edu.neu.csye6200.fbta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(int userId, User user) {
        if (userRepository.findById(userId).isEmpty()) {
            throw new NoResultException("User with ID : " + userId + " not found");
        }
        user.setId(userId);
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
