package org.example.javangersrestclient.controller;

import lombok.RequiredArgsConstructor;
import org.example.javangersrestclient.model.RickMortyCharacter;
import org.example.javangersrestclient.service.CharacterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api/characters") @RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping
    public List<RickMortyCharacter> getAllCharacters(@RequestParam (required = false) String status) {
        return characterService.getAllCharacters(status);
    }

    @GetMapping("/{id}")
    public RickMortyCharacter getCharacterById(@PathVariable int id) {
        return characterService.getCharacterById(id);
    }
}
