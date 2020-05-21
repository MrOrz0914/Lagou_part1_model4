package com.lagou.article.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Orz
 */
@Data
public class Article {
    private Integer id;

    private String title;

    private String content;

    private Date created;

    private Date modified;

    private String categories;

    private String tags;

    private Integer allowComment;

    private String thumbnail;
}
