package com.onlybook.integration;

import com.onlybook.domain.model.dtos.PostDTO;
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
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.junit.Assert.*;

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
        ResponseEntity<List<PostDTO>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<>() {
        });
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
        List<PostDTO> response = responseEntity.getBody();
        assertNotNull(response);
        assertTrue(response.size() > 0);
    }
}
