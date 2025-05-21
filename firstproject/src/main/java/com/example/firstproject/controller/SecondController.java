package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/random-quote")
    public String randomQuote(Model model){
        String[] quotes={
                "어둠속에선 장님이 최고의 길잡이일지어니."+" 광기의 시대엔 광인으로 하여금 길을 이끌게 하라",
                "죽음은 너의 나침반이다",
                "황제 폐하의 종은 죽어도 보복을 부르며 황제 폐하의 적은 반드시 응징받는다!",
                "기도는 영혼을 정화하나, 고통은 육신을 정화한다",
                "좁은 마음은 정돈된 마음이다",
                "성공은 기념되지만, 실패는 기억될 뿐이다",
                "현자는 타인의 죽음에서 배운다",
                "승리는 설명을 요하지 않으며, 패배는 설명을 허용치 않는다",
                "내가 쓰러진 자리를 열 명이, 그 열 명 하나마다 백 명이 따라와 채울 것이다!"+" 그러니 날 쓰러트려 봐라! 나는 시작일 뿐이니까!",
                "하지마라",
                "돌연변이를 알라, 돌연변이를 죽여라",
                "믿음이 나의 방패라",
                "악마는 두렵지 않다. 내가 두려움의 화신이니까",
                "현명한 자는 두려워하지 않는다."+" 겁에 질린 자는 생각하지 않는다",
                "개혁의 시작은 반역의 시작이다"
        };
        int randInt=(int) (Math.random()*quotes.length);
        model.addAttribute("randomQuote",quotes[randInt]);
        return"quote";
    }
}
