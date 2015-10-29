package com.example.news.services;

import java.util.Date;
import java.util.List;

import com.example.news.dto.NewsArticle;
import com.example.news.entity.NewsArticleEntity;

public interface NewsService {

	void addNews(NewsArticle news);

	void updateNews(NewsArticle news);

	void deleteNews(Long valueOf);

	List<NewsArticle> findNews(String keyword, Date dateFrom, Date dateTo);

	NewsArticle getNews(Long valueOf);

	List<NewsArticle> findAllNews();

}
