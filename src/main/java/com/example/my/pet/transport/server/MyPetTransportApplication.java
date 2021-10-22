package com.example.my.pet.transport.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.my.pet.transport.server")
public class MyPetTransportApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPetTransportApplication.class, args);
    }

}
