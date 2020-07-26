package com.faystmax.graalvm.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class GraalVMApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraalVMApplication.class, args);
    }
}
