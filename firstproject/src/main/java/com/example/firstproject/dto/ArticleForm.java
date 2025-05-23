package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    public Article toEntity(){
        return new Article(id, title, content);
    }

/*    public ArticleFrom(String title, String content) {
        this.title = title;
        this.content = content;
    }
*/
/*   @Override
    public String toString() {
        return "ArticleFrom{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
*/
}
