package org.example.javangersrestclient.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ReqresCreatedUserDTO {

    private String name;
    private String job;
    private String id;
    private String createdAt;
}
