package com.onlybook.service;

import com.onlybook.domain.model.dtos.PostDTO;
import com.onlybook.domain.utils.DtoMapper;
import com.onlybook.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDTO> getPosts() {
        return postRepository.findAll()
                .stream()
                .map(DtoMapper::postToPostDTO)
                .collect(Collectors.toList());
    }
}
