//package com.example.news;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.example.news.entity.NewsArticleEntity;
//import com.example.news.repos.NewsArticleRepository;
//
//public class NewsArticleRepositoryTest {
//
//	@Autowired
//	NewsArticleRepository newsArticleRepository;
//	
//	
//	
//	public NewsArticleRepository getNewsArticleRepository() {
//		return newsArticleRepository;
//	}
//
//
//
//	public void setNewsArticleRepository(NewsArticleRepository newsArticleRepository) {
//		this.newsArticleRepository = newsArticleRepository;
//	}
//
//
//
//	@Test
//	public void saveNewsArticle_isStoredd() {
//		NewsArticleEntity nae = new NewsArticleEntity();
//		newsArticleRepository.save(nae);
//	}
//}
