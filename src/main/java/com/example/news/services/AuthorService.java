package com.example.news.services;

import java.util.List;

import com.example.news.dto.ArticleAuthor;
import com.example.news.dto.NewsArticle;

public interface AuthorService {
	List<NewsArticle> findAuthorNews(Long id);
	List<ArticleAuthor> findAllAuthors();

}
