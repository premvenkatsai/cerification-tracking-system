package com.klu.jfsd.Entries;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api") // This sets the base URL for the controller
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from your frontend
public class UserController {

    @PostMapping("/signup") // Defines the /signup endpoint
    public ResponseEntity<String> signup(@RequestBody CertificationUsers user) {
        // Logic for handling sign-up
        return ResponseEntity.ok("User signed up successfully!");
    }
}


