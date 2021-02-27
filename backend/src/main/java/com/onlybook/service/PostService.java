package com.onlybook.service;

import com.onlybook.domain.model.dtos.PostDTO;

import java.util.List;

public interface PostService {
    List<PostDTO> getPosts();
    List<PostDTO> getPostsContainingSequenceInTitle(String sequence);
}
