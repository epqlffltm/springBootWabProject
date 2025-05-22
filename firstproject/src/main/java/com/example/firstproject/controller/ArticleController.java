package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleFrom;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleFrom from) {
        Article article = from.toEntity();
        log.info(from.toString());
        //1. DTO를 엔티티로 변환
        article = from.toEntity();
        //2. 리파지토리로 엔티티를 BD에 저장
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        return "";
    }
}
