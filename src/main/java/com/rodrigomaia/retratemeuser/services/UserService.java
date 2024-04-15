package com.rodrigomaia.retratemeuser.services;

import com.rodrigomaia.retratemeuser.models.UserModel;
import com.rodrigomaia.retratemeuser.producers.UserProducer;
import com.rodrigomaia.retratemeuser.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    final UserRepository userRepository;
    final UserProducer userProducer;

    public UserService(UserRepository userRepository, UserProducer userProducer) {
        this.userRepository = userRepository;
        this.userProducer = userProducer;
    }

//    @Transactional
    public UserModel save(UserModel userModel)
    {
        userModel = userRepository.save(userModel);
        userProducer.publishMessageEmail(userModel);
        return userModel;
    }
}