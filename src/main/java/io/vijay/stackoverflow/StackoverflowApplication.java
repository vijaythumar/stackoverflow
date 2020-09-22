package io.vijay.stackoverflow;

import io.vijay.stackoverflow.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StackoverflowApplication {

    public static void main(String[] args) {

        User user1 = new User(13,"sfsdfs","sdfsdf","sdfsdfsdfsfsdfs",null);

        System.out.println(user1);

        SpringApplication.run(StackoverflowApplication.class, args);
    }

}
