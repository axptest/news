package com.example.news.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NewsArticle {
	private long id;
	private String header;
	private String shortDesc;
	private String text;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date publishDate;
	private ArticleAuthor author;
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
	
	public ArticleAuthor getAuthor() {
		return author;
	}
	public void setAuthor(ArticleAuthor author) {
		this.author = author;
	}
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	
	
}
