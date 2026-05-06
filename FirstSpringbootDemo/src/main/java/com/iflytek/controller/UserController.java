package com.iflytek.controller;

import com.iflytek.entity.User;
import com.iflytek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        userService.saveUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @PostMapping("/update")
    public int updateUser(@RequestBody User user){
       return userService.updateUser(user);
    }
    @PostMapping("/delete")
    public  int deleteUser(Long id){
        return userService.deleteUser(id);
    }
}

