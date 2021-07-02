package com.scaler.bookmyshow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUser(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
