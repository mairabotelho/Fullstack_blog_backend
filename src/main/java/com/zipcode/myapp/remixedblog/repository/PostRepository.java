package com.zipcode.myapp.remixedblog.repository;

import com.zipcode.myapp.remixedblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
