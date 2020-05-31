package com.spring.weblog.service;

import com.spring.weblog.model.Post;

import java.util.List;

public interface WeblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
