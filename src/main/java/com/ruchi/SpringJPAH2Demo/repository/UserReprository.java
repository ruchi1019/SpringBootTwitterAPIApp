package com.ruchi.SpringJPAH2Demo.repository;

import com.ruchi.SpringJPAH2Demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserReprository extends JpaRepository <User, Long>{
List<User> findByFirstName(String firstName);
List<User> findByFirstNameAndLastName(String firstName,String lastName);
}
