package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticleFrom {
    private String title;
    private String content;

    public ArticleFrom(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleFrom{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null,title,content);
    }
}
