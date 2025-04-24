package org.example.javangersrestclient.controller;

import lombok.RequiredArgsConstructor;
import org.example.javangersrestclient.model.ReqresUser;
import org.example.javangersrestclient.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/api/users") @RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<ReqresUser> getAllUsers() {
        return userService.getAllUsers();
    }
}
