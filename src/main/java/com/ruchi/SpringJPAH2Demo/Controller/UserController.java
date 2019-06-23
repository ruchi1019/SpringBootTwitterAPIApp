package com.ruchi.SpringJPAH2Demo.Controller;

import com.ruchi.SpringJPAH2Demo.model.User;
import com.ruchi.SpringJPAH2Demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/users")
    public List<User> getAllUser(){

        return userService.findAllUsers();
    }
    @GetMapping("/user/{id}")
    public User getUSerById(@PathVariable("Id") Long Id){

         return userService.getUserById(Id);
    }
    @RequestMapping(value = {"/user"}, method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        userService.createUser(user);
    return userService.getUserById(user.getId());
    }
    @DeleteMapping("/user/{id}")
    public User DeleteUser(@PathVariable("Id") Long Id){
        User user = userService.getUserById(Id);
        userService.delterUser(Id);
        return user;
    }
    @RequestMapping(value = {"/user"}, method = RequestMethod.POST)
    public User updateUser(@RequestBody User user){
        userService.updateUser(user);
        return userService.getUserById(user.getId());
    }
}
