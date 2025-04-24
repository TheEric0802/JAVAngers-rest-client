package org.example.javangersrestclient.model.dto;

import lombok.Data;
import org.example.javangersrestclient.model.ReqresUser;

import java.util.List;

@Data
public class ReqresAllUsersDTO {

    private int total_pages;
    private List<ReqresUser> data;
}
