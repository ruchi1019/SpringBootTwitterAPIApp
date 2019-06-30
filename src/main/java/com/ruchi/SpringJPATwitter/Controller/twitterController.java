package com.ruchi.SpringJPATwitter.Controller;

import com.ruchi.SpringJPATwitter.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import twitter4j.Status;
import twitter4j.TwitterException;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class twitterController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
@Autowired
TwitterService twitterService;


    @GetMapping("/twitter/home")
    public List<Status> getTimeLine() throws TwitterException {

        return twitterService.getTimeLine();
    }
}
