package com.onlybook.webcontroller;

import com.onlybook.domain.model.dtos.PostDTO;
import com.onlybook.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/post")
@RestController
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDTO> getPosts() {
        log.debug("Entered class = PostController, method = getPosts");
        return postService.getPosts();
    }
}
