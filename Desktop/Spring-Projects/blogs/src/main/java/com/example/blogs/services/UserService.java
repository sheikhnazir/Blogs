package com.example.blogs.services;

import com.example.blogs.models.User;
import com.example.blogs.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository3;

    public User createUser(String username, String password){
            User user = new User();
            user.setFirstName("test");
            user.setLastName("test");
            user.setUsername(username);
            user.setPassword(password);
            userRepository3.save(user);
            return user;

    }

    public void deleteUser(int userId){
        userRepository3.deleteById(userId);

    }

    public User updateUser(Integer id, String password){
  User user = userRepository3.findById(id).get();
           user.setPassword(password);
            userRepository3.save(user);
           return user;
    }
}