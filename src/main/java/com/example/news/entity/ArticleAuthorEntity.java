package com.example.news.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class ArticleAuthorEntity {

	@Id
	@GeneratedValue
	Long Id;

	@Column
	private String name;

	
	 @OneToMany(mappedBy="author")
	  private List<NewsArticleEntity> news;
	 
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NewsArticleEntity> getNews() {
		return news;
	}

	public void setNews(List<NewsArticleEntity> news) {
		this.news = news;
	}
	
}
