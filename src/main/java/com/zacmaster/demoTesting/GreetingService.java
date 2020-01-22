package com.zacmaster.demoTesting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(){
        return "Hello, mock";
    }
}
