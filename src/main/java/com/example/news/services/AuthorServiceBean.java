package com.example.news.services;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.news.dto.ArticleAuthor;
import com.example.news.dto.NewsArticle;
import com.example.news.entity.ArticleAuthorEntity;
import com.example.news.entity.NewsArticleEntity;
import com.example.news.repos.AuthorRepository;

@Service
public class AuthorServiceBean implements AuthorService{

	@Autowired
	AuthorRepository authorRepository;
	Mapper mapper = new DozerBeanMapper();
	
	@Override
	public List<NewsArticle> findAuthorNews(Long id) {
		ArticleAuthorEntity author = authorRepository.findOne(id);
		List<NewsArticle> articles = new ArrayList<NewsArticle>();
		for(NewsArticleEntity nae : author.getNews()) {
			articles.add(mapper.map(nae, NewsArticle.class));
		}
		return articles;
	}

	@Override
	public List<ArticleAuthor> findAllAuthors() {
		List<ArticleAuthor> authors = new ArrayList<ArticleAuthor>();
		for(ArticleAuthorEntity nae : authorRepository.findAll()) {
			authors.add(mapper.map(nae, ArticleAuthor.class));
		}
		return authors;
	}

}
