package com.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.model.Post;
import com.example.graphql.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    private PostRepository postRepository;

    public List<Post> getRecentPosts(int count, int offset) {
        return postRepository.getRecentPosts(count, offset);
    }
}