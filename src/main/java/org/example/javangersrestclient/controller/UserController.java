package org.example.javangersrestclient.controller;

import lombok.RequiredArgsConstructor;
import org.example.javangersrestclient.model.ReqresUser;
import org.example.javangersrestclient.model.dto.ReqresCreatedUserDTO;
import org.example.javangersrestclient.model.dto.ReqresNewUserDTO;
import org.example.javangersrestclient.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api/users") @RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<ReqresUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public ReqresCreatedUserDTO createUser(@RequestBody ReqresNewUserDTO newUser) {
        return userService.createUser(newUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
