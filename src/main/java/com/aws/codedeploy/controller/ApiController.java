package com.aws.codedeploy.controller;

import com.aws.codedeploy.service.IpSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    @Autowired
    private IpSerivce ipSerivce;

    @GetMapping("api/ip")
    public ResponseEntity<?> fetchIpAddress(){
        return ResponseEntity.ok(ipSerivce.getIpAddress());
    }
}
