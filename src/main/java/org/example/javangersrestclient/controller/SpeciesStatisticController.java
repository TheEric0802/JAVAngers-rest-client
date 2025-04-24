package org.example.javangersrestclient.controller;

import lombok.RequiredArgsConstructor;
import org.example.javangersrestclient.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/species-statistic") @RequiredArgsConstructor
public class SpeciesStatisticController {

    private final CharacterService characterService;

    @GetMapping
    public String getSpeciesStatistic(@RequestParam String species) {
        return String.valueOf(characterService.getAllCharacters("Alive", species).size());
    }
}
