package org.example.javangersrestclient.controller;

import lombok.RequiredArgsConstructor;
import org.example.javangersrestclient.model.RickMortyCharacter;
import org.example.javangersrestclient.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/api/characters") @RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping
    public List<RickMortyCharacter> getAllCharacters() {
        return characterService.getAllCharacters();
    }
}
