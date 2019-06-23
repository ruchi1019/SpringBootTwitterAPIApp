package com.ruchi.SpringJPAH2Demo.commandLineRunner;

import com.ruchi.SpringJPAH2Demo.model.User;
import com.ruchi.SpringJPAH2Demo.repository.UserReprository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserCRUDCommandLineRunner implements CommandLineRunner {
    @Autowired
    UserReprository userReprository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Is command line runner");
        User user1 = new User("Rod","Johnson");
        User user2 = new User("Uncle","Bob");
        userReprository.save(user1);
        userReprository.save(user2);
        userReprository.save(new User("Uncle","Sen"));
        userReprository.save(new User("Smith","Johnson"));
       /* List<User> users= userReprository.findAll();
        System.out.println("Fetching all user detail ");
        System.out.println(users);
        System.out.println("Deleting the user1 detail");
        userReprository.delete(user1);
         users= userReprository.findAll();
        System.out.println(users);
        System.out.println("Updating the user first name");
        user2.setFirstName("Ruchi");
        userReprository.save(user2);
        users =userReprository.findAll();
        System.out.println(users);
        System.out.println("Searching via custom API user first name");
        users = userReprository.findByFirstName("Uncle");
        System.out.println(users);
        System.out.println("Searching via custom API user first & last name");
        users = userReprository.findByFirstNameAndLastName("Smith","Johnson");
        System.out.println(users);

        */
    }
}
