package com.example.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.Post;
import com.example.graphql.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    private PostRepository postRepository;


    public Post writePost(String title, String text, String category, String author) {
        Post post = new Post();
        post.setId(UUID.randomUUID().toString());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(author);
        postRepository.savePost(post);

        return post;
    }
}
