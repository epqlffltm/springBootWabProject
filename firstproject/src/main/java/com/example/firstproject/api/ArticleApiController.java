package com.example.firstproject.api;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j//로그를 찍을 수 있는 어노테이션 추가
@RestController//REST API용 컨트롤러
public class ArticleApiController {
    @Autowired//게시글 리파지토리 주입
    private ArticleService articleService;
    //GET
    @GetMapping("/api/articles")
    public List<Article>index(){
        return articleService.index();
    }

    @GetMapping("/api/articles/{id}")
    public Article show(@PathVariable Long id) {
        return articleService.show(id);
    }

    //POST
    @PostMapping("/api/articles")
    public ResponseEntity<Article> create(@RequestBody ArticleForm dto){
        Article created = articleService.create(dto);
        return (created != null)?ResponseEntity.status(HttpStatus.OK).body(created):ResponseEntity.status(HttpStatus.BAD_REQUEST).build();//삼항연산자
                //articleRepository.save(created);
    }
//
//    //PATCH
    @PatchMapping("/apt/articles/{id}")
    public ResponseEntity<Article> update(@PathVariable long id, @RequestBody ArticleForm dto){

    }
//    //DELETE
    @DeleteMapping("/api/articles/{id}")
    public ResponseEntity<Article>delete(@PathVariable Long id){
        Article deleted = articleService.delete(id);
        return (deleted != null) ? ResponseEntity.status(HttpStatus.NO_CONTENT).build():ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
