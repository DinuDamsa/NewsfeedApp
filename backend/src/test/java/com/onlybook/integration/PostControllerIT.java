package com.onlybook.integration;

import com.onlybook.domain.model.dtos.PostDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PostControllerIT {

    @Value("${spring.rest.base-url}")
    private String baseUrl;

    @Value("${spring.rest.post-path}")
    private String postPath;

    private RestTemplate restTemplate;

    @Before
    public void init() {
        this.restTemplate = new RestTemplate();
    }

    @Test
    public void getPosts_OK() {
        URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment(postPath)
                .build()
                .toUri();
        ResponseEntity<List<PostDTO>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null,
                new ParameterizedTypeReference<>() {});
        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
        List<PostDTO> response = responseEntity.getBody();
        Assert.assertNotNull(response);
        Assert.assertTrue(response.size() > 0);
    }

    @Test
    public void getPostsWithTitleContainingSequence_OK() {
        String queryString = "hand";
        URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment(postPath)
                .queryParam("name", queryString)
                .build()
                .toUri();
        ResponseEntity<List<PostDTO>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null,
                new ParameterizedTypeReference<>() {});
        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
        List<PostDTO> response = responseEntity.getBody();
        Assert.assertNotNull(response);
        Assert.assertEquals(2, response.size());
    }



    @Test
    public void getPostsWithTitleContainingSequence_NOT_FOUND() {
        String queryString = "SOMETHING_NON_EXISTENT";
        URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment(postPath)
                .queryParam("name", queryString)
                .build()
                .toUri();
        try {
             restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<>() {});
             Assert.fail("Should have gotten 404 NOT_FOUND");
        } catch (HttpClientErrorException e) {
            Assert.assertEquals(404, e.getRawStatusCode());
        }
    }
}
