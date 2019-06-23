package com.ruchi.SpringJPAH2Demo.service;

import com.ruchi.SpringJPAH2Demo.model.User;
import com.ruchi.SpringJPAH2Demo.repository.UserReprository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.ref.PhantomReference;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserReprository userReprository;


    public List<User> findAllUsers(){
        return  userReprository.findAll();
    }
    public User getUserById(Long Id){
         Optional<User>userOptional=userReprository.findById(Id);
         log.debug("User with id:{}",Id,userOptional.get());
         return userOptional.get();
    }
    public User createUser(User user){
       userReprository.save(user);
    return user;
    }
    public User updateUser(User user){
        userReprository.save(user);
        return user;
    }
    public User delterUser(Long Id){
        User user =getUserById(Id);
        userReprository.deleteById(Id);
        return user;
    }
}
