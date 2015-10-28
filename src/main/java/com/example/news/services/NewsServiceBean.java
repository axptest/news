package com.example.news.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.news.dto.NewsArticle;

@Service
public class NewsServiceBean implements NewsService {

	
	public void addNews(NewsArticle news) {
		
	}

	
	public void updateNews(NewsArticle news) {
		
	}

	
	public void deleteNews(Long valueOf) {
		
	}

	public List<NewsArticle> findNews(String keyword, String dateFrom,
			String dateTo) {
		List<NewsArticle> allNews = new ArrayList<NewsArticle>();
		allNews.add(new NewsArticle());
		return allNews;
	}


	public NewsArticle getNews(Long valueOf) {
		return new NewsArticle();
	}

}
