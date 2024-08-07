package com.authback.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdminController {
    @GetMapping(value = "")
    public ResponseEntity<?> getAdmin() {
        return ResponseEntity.status(HttpStatus.OK).body("{ \"message\": \"Este endpoint es de rol Admin.\"}");
    }
}