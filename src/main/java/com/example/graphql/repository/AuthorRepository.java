package com.example.graphql.repository;

import com.example.graphql.model.Author;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorRepository {
    private List<Author> authors;

    public Optional<Author> getAuthorByName(String name) {
        return authors.stream().filter(author -> name.equals(author.getName())).findFirst();
    }

    public Optional<Author> getAuthorById(String authorId) {
        return authors.stream().filter(author -> authorId.equals(author.getId())).findFirst();
    }

    public Author saveAuthor(final Author author) {
        authors.add(0, author);
        return authors.get(0);
    }
}
