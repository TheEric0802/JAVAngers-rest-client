package org.example.javangersrestclient.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data @AllArgsConstructor
public class ReqresCreatedUserDTO {

    private String name;
    private String job;
    private String id;
    private Instant createdAt;
}
