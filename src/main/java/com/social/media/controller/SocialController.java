package com.social.media.controller;

import com.social.media.Service.SocialService;
import com.social.media.model.SocialUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("social")
public class SocialController {
    @Autowired
    private SocialService socialService;

    @GetMapping("/users")
    public ResponseEntity<List<SocialUser>> getUsers() {
        return new ResponseEntity<>(socialService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<SocialUser> createUsers(@RequestBody SocialUser socialUser) {
        return new ResponseEntity<>(socialService.createUsers(socialUser), HttpStatus.CREATED);
    }
}
