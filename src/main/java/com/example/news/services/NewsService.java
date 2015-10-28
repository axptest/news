package com.example.news.services;

import java.util.List;

import com.example.news.dto.NewsArticle;

public interface NewsService {

	void addNews(NewsArticle news);

	void updateNews(NewsArticle news);

	void deleteNews(Long valueOf);

	List<NewsArticle> findNews(String keyword, String dateFrom, String dateTo);

	NewsArticle getNews(Long valueOf);

}
