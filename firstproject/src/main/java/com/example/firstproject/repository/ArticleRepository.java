package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    // findAll()은 JpaRepository에서 기본 지원하며 List 반환
}
