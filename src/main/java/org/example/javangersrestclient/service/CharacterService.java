package org.example.javangersrestclient.service;

import org.example.javangersrestclient.model.RickMortyCharacter;
import org.example.javangersrestclient.model.dto.RickMortyAllCharactersDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class CharacterService {

    private final RestClient restClient;

    public CharacterService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://rickandmortyapi.com/api/character").build();
    }

    public List<RickMortyCharacter> getAllCharacters() {
        int currentPage = 1;
        int totalPages = 0;
        List<RickMortyCharacter> result = new java.util.ArrayList<>();

        do {
            RickMortyAllCharactersDTO page = restClient.get().uri("/?page=" + currentPage).retrieve().body(RickMortyAllCharactersDTO.class);
            assert page != null;
            totalPages = page.getInfo().getPages();
            currentPage++;
            result.addAll(page.getResults());
        } while (currentPage <= totalPages);

        return result;
    }

    public RickMortyCharacter getCharacterById(int id) {
        return restClient.get().uri("/" + id).retrieve().body(RickMortyCharacter.class);
    }
}
