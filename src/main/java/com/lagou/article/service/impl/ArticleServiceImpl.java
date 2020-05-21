package com.lagou.article.service.impl;

import com.lagou.article.dao.ArticleDao;
import com.lagou.article.pojo.Article;
import com.lagou.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Orz
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> findAll() {
        return articleDao.findAll();
    }
}
