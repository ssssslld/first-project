package com.git.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {

    public static void main(String[] args) {
        System.out.println("作修改");
        SpringApplication.run(StartApplication.class, args);
        System.out.println("成功创建了一个项目，编辑文字");
    }
}
