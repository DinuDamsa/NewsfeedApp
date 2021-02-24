package com.onlybook.service;

import com.onlybook.domain.Post;
import com.onlybook.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }
}
