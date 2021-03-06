package com.huyvn.happytostudy.services;

import com.huyvn.happytostudy.model.User;
import com.huyvn.happytostudy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save (User user) {
        return userRepository.save(user);
    }

    public void delete(int userId ) {
        userRepository.delete(userRepository.findOne(userId));
    }
}
