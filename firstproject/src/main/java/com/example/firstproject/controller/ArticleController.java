package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleFrom;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

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
        return "redirect:/articles/"+saved.getId();
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model){
        log.info("id="+id);
        //1. id를 조회해서 데이터 가저오기
        //Optional<Article> articleEntity=articleRepository.findById(id);
        Article articleEntity=articleRepository.findById(id).orElse(null);
        //2. 모델에 데이터 등록하기
        model.addAttribute("article",articleEntity);
        //3. 뷰 페이지 반환하기
        return "articles/show";
    }

    @GetMapping("/articles")
    public String index(Model model){
        //1. 모든 데이터 가저오기
        ArrayList<Article> articlesEntityList=articleRepository.findAll();
        //2. 모델에 데이터 증록
        model.addAttribute("articleList", articlesEntityList);
        //3. 뷰 페이지 설정하기
        return "articles/index";
    }
}
