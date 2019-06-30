
package com.ruchi.SpringJPATwitter.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Entity
public class User {

    private final long id;
    private final String content;

    public User(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
