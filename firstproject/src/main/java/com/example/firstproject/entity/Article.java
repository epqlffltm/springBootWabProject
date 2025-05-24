package com.example.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor//기본생성자 추가 어노테이션
@ToString
@Entity
@Getter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
    public void patch(Article article) {
        if (article.title != null)
            this.title = article.title;
        if (article.content != null)
            this.content = article.content;
    }

    //Article샌성자 추가
    /*public Article(Long id, String title, String content){
        this.id=id;
        this.title=title;
        this.content=content;
    }
    //toString()매서드 추가
    @Override
    public String toString(){
        return "Artcle{"+"id="+id+", title='"+title+'\''+",content='"+content+'\''+'}';
    }
     */
    /*
    public Long getId(){
        return "";
    }
    */
}
