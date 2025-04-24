package org.example.javangersrestclient.controller;

import lombok.RequiredArgsConstructor;
import org.example.javangersrestclient.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/users") @RequiredArgsConstructor
public class UserController {

    private final UserService userService;
}
