package com.example.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.model.Author;
import com.example.graphql.model.Post;
import com.example.graphql.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {

    private PostRepository postRepository;

    public List<Post> getPosts(Author author) {
        return postRepository.getAuthorPosts(author.getId());
    }
}