package com.android.kutmoblie;

import java.util.Date;

public class News {
    private long id;
    private String title;
    private Date article_date;
    private String cover_link;
    private String article_link;
    private String article;

    public News(long id, String title, Date article_date, String cover_link, String article_link, String article) {
        this.id = id;
        this.title = title;
        this.article_date = article_date;
        this.cover_link = cover_link;
        this.article_link = article_link;
        this.article = article;
    }

    public News() {

    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", article_date=" + article_date +
                ", cover_link='" + cover_link + '\'' +
                ", article_link='" + article_link + '\'' +
                ", article='" + article + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getArticle_date() {
        return article_date;
    }

    public void setArticle_date(Date article_date) {
        this.article_date = article_date;
    }

    public String getCover_link() {
        return cover_link;
    }

    public void setCover_link(String cover_link) {
        this.cover_link = cover_link;
    }

    public String getArticle_link() {
        return article_link;
    }

    public void setArticle_link(String article_link) {
        this.article_link = article_link;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
