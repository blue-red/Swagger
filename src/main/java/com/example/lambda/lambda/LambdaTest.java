package com.example.lambda.lambda;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LambdaTest {


    @PostConstruct
    public void init(){
        new Thread(() -> System.out.println("dddd")).start();
    }

}
