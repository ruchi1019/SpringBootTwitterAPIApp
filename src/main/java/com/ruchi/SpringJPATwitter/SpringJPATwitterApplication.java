package com.ruchi.SpringJPATwitter;

import com.fasterxml.jackson.core.JsonParser;
import com.ruchi.SpringJPATwitter.model.User;
import com.ruchi.SpringJPATwitter.service.TwitterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.async.DeferredResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.util.*;

@SpringBootApplication
public class SpringJPATwitterApplication {



	public static void main(String[] args) throws TwitterException {
		SpringApplication.run(SpringJPATwitterApplication.class, args);
		//TwitterService twitterService = new TwitterService();
		//System.out.println(twitterService.getTimeLine());

    }
}
