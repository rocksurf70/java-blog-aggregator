package com.jmillar.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmillar.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
