package com.rodrigomaia.retratemeuser.controllers;

import com.rodrigomaia.retratemeuser.dtos.UserRecordDTO;
import com.rodrigomaia.retratemeuser.models.UserModel;
import com.rodrigomaia.retratemeuser.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/users")
    public ResponseEntity<UserModel> createUser(@RequestBody @Valid UserRecordDTO userRecordDTO){

        var userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDTO, userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userModel));
    }

}
