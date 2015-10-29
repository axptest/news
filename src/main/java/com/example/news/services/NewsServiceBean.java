package com.example.news.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.news.dto.NewsArticle;
import com.example.news.entity.NewsArticleEntity;
import com.example.news.repos.NewsArticleRepository;

@Service
public class NewsServiceBean implements NewsService {

	@Autowired
	NewsArticleRepository repository;
	Mapper mapper = new DozerBeanMapper();

	public void addNews(NewsArticle news) {
		NewsArticleEntity nae = mapper.map(news, NewsArticleEntity.class);
		repository.save(nae);
	}

	public void updateNews(NewsArticle news) {
		NewsArticleEntity nae = mapper.map(news, NewsArticleEntity.class);
		repository.save(nae);
	}

	public void deleteNews(Long id) {
		repository.delete(id);
	}

	public List<NewsArticle> findNews(String keyword, Date dateFrom,
			Date dateTo) {
		List<NewsArticle> articles = new ArrayList<NewsArticle>();
		if(keyword !=null) {
		for(NewsArticleEntity nae : repository.findNewsArticlesByKeywor(keyword)) {
			articles.add(mapper.map(nae, NewsArticle.class));
		}
		} else {
			for(NewsArticleEntity nae : repository.findNewsArticlesByDateRange(dateFrom,dateTo)) {
				articles.add(mapper.map(nae, NewsArticle.class));
			}
		}
		return articles;
	}

	public NewsArticle getNews(Long id) {
		return mapper.map(repository.findOne(id), NewsArticle.class);
	}

	@Override
	public List<NewsArticle> findAllNews() {
		List<NewsArticle> articles = new ArrayList<NewsArticle>();
		for(NewsArticleEntity nae : repository.findAll()) {
			articles.add(mapper.map(nae, NewsArticle.class));
		}
		return articles;
		
	}

}
