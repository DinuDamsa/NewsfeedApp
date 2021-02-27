package com.onlybook.services;

import com.onlybook.domain.exceptions.PostNotFoundException;
import com.onlybook.domain.model.Category;
import com.onlybook.domain.model.Post;
import com.onlybook.domain.model.PostDetails;
import com.onlybook.domain.model.User;
import com.onlybook.domain.model.dtos.PostDTO;
import com.onlybook.repositories.PostRepository;
import com.onlybook.service.PostService;
import com.onlybook.service.PostServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class PostServiceTest {

    @Mock
    PostRepository postRepository;

    private PostService postService;
    private List<Post> postList;

    @Before
    public void init() {
        initData();
        this.postService = new PostServiceImpl(postRepository);
    }

    private void initData() {
        postList = new ArrayList<>();
        String username = "Username";
        String aboutYou = "about you";
        String profileImagePath = null;

        Category category1 = new Category(1L, "Funny");
        Category category2 = new Category(2L, "Animals");

        User user1 = new User(1L, username, "Marty", aboutYou, profileImagePath);
        User user2 = new User(2L, username, "Scott", aboutYou, profileImagePath);

        postList.add(new Post(111111L,  user1, new PostDetails(1L, "title1", "text content 1",
                null), category1));
        postList.add(new Post(222222L,  user1, new PostDetails(2L, "Big win", "text content 2",
                null), category1));
        postList.add(new Post(333333L,  user1, new PostDetails(3L, "tai", "text content 3",
                null), category2));
        postList.add(new Post(444444L,  user2, new PostDetails(4L, "randomtitle", "text content 4",
                null), category2));
        postList.add(new Post(555555L,  user2, new PostDetails(5L, "Title", "text content 5",
                null), category2));

    }

    @Test
    public void getPostsContainingSequenceInTitleTest() {
        when(postRepository.findAll()).thenReturn(postList);
        String testedSequence = "ti";
        List<PostDTO> result = postService.getPostsContainingSequenceInTitle(testedSequence);
        verify(postRepository, times(1)).findAll();
        Assert.assertEquals(2, result.size());
        result.forEach(postDTO -> Assert.assertTrue(postDTO.getTitle().contains(testedSequence)));
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void getPostsContainingSequenceInTitleTest_NotFound() {
        when(postRepository.findAll()).thenReturn(postList);
        exceptionRule.expect(PostNotFoundException.class);
        String testedSequence = "SEQUENCE NOT FOUND";
        try {
            postService.getPostsContainingSequenceInTitle(testedSequence);
        } finally {
            verify(postRepository, times(1)).findAll();
        }
    }
}
