package com.example.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.model.Author;
import com.example.graphql.model.Post;
import com.example.graphql.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {

    private AuthorRepository authorRepository;

    public Author getAuthor(Post post) {
        return authorRepository.getAuthorById(post.getAuthorId()).orElseThrow(RuntimeException::new);
    }
}