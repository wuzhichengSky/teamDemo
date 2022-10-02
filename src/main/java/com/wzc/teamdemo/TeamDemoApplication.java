package com.wzc.teamdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeamDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamDemoApplication.class, args);
        System.out.println(123);
    }

}
