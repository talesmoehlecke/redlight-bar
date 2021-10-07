package com.redlightbar.service.impl;

import com.redlightbar.model.User;
import com.redlightbar.repository.UserRepository;
import com.redlightbar.service.UserService;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService {

    private UserRepository userRepository;

    @Autowired
    public DefaultUserService(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
