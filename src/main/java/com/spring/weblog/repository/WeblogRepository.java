package com.spring.weblog.repository;

import com.spring.weblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeblogRepository extends JpaRepository<Post, Long> {

}
