package com.authback.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping("")
    public ResponseEntity<?> getClient(){
        return ResponseEntity.status(HttpStatus.OK).body("{ \"message\": \"Este endpoint es de rol Cliente.\"}");
    }
}
