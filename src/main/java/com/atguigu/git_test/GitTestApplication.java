package com.atguigu.git_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("master");
        System.out.println("master");
        System.out.println("push");
        System.out.println("push2");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
