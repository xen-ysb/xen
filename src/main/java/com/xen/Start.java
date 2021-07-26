package com.xen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class Start {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(Start.class,args);
    }
}
