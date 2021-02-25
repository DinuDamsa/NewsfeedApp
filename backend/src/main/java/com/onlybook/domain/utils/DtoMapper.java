package com.onlybook.domain.utils;

import com.onlybook.domain.model.Post;
import com.onlybook.domain.model.dtos.PostDTO;

public class DtoMapper {
    public static PostDTO postToPostDTO(Post post) {
        return new PostDTO(
                post.getId(),
                post.getPostDetails().getTitle(),
                post.getPostDetails().getTextContent(),
                post.getPostDetails().getContentPicturePath(),
                post.getUser().getNickname(),
                post.getCategory().getCategoryName()
                );
    }
}
