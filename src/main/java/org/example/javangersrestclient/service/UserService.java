package org.example.javangersrestclient.service;

import org.example.javangersrestclient.model.ReqresUser;
import org.example.javangersrestclient.model.dto.ReqresAllUsersDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class UserService {

    private final RestClient restClient;

    public UserService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://reqres.in/api/users").build();
    }

    public List<ReqresUser> getAllUsers() {
        int currentPage = 1;
        int totalPages = 0;
        List<ReqresUser> result = new java.util.ArrayList<>();

        do {
            ReqresAllUsersDTO page = restClient.get().uri("?page=" + currentPage).retrieve().body(ReqresAllUsersDTO.class);
            assert page != null;
            totalPages = page.getTotal_pages();
            currentPage++;
            result.addAll(page.getData());
        } while (currentPage <= totalPages);

        return result;
    }
}
