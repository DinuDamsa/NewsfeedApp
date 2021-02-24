package com.onlybook.domain.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    private long id;
    private String title;
    private String textContent;
    private String contentPicturePath;
    private String userNickname;
    private String category;

}
