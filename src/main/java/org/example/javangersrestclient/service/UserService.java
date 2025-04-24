package org.example.javangersrestclient.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class UserService {

    private final RestClient restClient;

    public UserService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://reqres.in/api/users").build();
    }
}
