package com.myblog.myblog.repository;

import com.myblog.myblog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//date 04/01
public interface PostRepository extends JpaRepository<Post , Long> {
}
