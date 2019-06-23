package com.ruchi.SpringJPAH2Demo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long Id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;

    /*public User() {
    }*/

    public User( String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

   /* public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }*/

    /*@Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }*/
}
