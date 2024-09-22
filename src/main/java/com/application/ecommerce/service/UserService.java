package com.application.ecommerce.service;

import com.application.ecommerce.modals.User;
import com.application.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void saveUser(User user) {
        repository.save(user);
    }
    public User getUser(Integer id) {
        return repository.findById(id).orElse(null);
    }
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }
}
