package com.example.news.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.news.entity.NewsArticleEntity;



public interface NewsArticleRepository extends CrudRepository<NewsArticleEntity, Long>  {
	
	@Query("select na from NewsArticleEntity na where  :keyword  in elements( na.keywords)")
	List<NewsArticleEntity> findNewsArticlesByKeywor(@Param("keyword") String keyword);
	
	@Query("select na from NewsArticleEntity na where na.publishDate >= :dateFrom and na.publishDate <= :dateTo ")
	List<NewsArticleEntity> findNewsArticlesByDateRange(@Param("dateFrom") Date from, 
														@Param("dateTo") Date to); 	
}

