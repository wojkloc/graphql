package com.example.graphql.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Author {
    private String id;
    private String name;
    private String thumbnail;

}
