package com.aws.codedeploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("api/automate")
    public ResponseEntity<?> automate(){
        return ResponseEntity.ok("Building CI/CD by AWS");
    }
}
