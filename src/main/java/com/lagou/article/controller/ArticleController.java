package com.lagou.article.controller;

import com.lagou.article.pojo.Article;
import com.lagou.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Orz
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/index")
    public String findAll(Model model) {
        List<Article> list = articleService.findAll();
        model.addAttribute("articles", list);
        return "client/index";
    }
}
