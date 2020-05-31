package com.spring.weblog.service.serviceImpl;

import com.spring.weblog.model.Post;
import com.spring.weblog.repository.WeblogRepository;
import com.spring.weblog.service.WeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeblogServiceImpl implements WeblogService {

    @Autowired
    WeblogRepository weblogRepository;

    @Override
    public List<Post> findAll() {
        return weblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return weblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return weblogRepository.save(post);
    }
}
