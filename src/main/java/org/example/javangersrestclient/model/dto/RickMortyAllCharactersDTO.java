package org.example.javangersrestclient.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.javangersrestclient.model.RickMortyCharacter;

import java.util.List;

@Data @AllArgsConstructor
public class RickMortyAllCharactersDTO {

    private RickMortyAllCharactersInfoDTO info;
    private List<RickMortyCharacter> results;
}
