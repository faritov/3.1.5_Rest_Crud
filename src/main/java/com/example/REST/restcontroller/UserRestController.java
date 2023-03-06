package com.example.REST.restcontroller;

import com.example.REST.model.User;
import com.example.REST.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class UserRestController {
    private final UserService userService;


    public UserRestController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/api/userPage")
    public ResponseEntity<User> showAuthUser(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}