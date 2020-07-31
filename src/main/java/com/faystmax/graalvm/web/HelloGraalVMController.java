package com.faystmax.graalvm.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGraalVMController {
    @GetMapping("/")
    public String hello() {
        return "Hello from GraalVM";
    }
}
