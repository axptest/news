package com.example.news.dto;

import java.util.Date;
import java.util.List;

public class NewsArticle {
	private Long id;
	private String header;
	private String shortDesc;
	private String text;
	private Date publishDate;
	private List<ArticleAuthor> authors;
	private List<String> keywords;
	
	
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public List<ArticleAuthor> getAuthors() {
		return authors;
	}
	public void setAuthors(List<ArticleAuthor> authors) {
		this.authors = authors;
	}
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	
	
}
