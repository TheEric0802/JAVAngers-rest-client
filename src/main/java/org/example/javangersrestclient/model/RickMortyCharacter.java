package org.example.javangersrestclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class RickMortyCharacter {

    private int id;
    private String name;
    private String species;
}
