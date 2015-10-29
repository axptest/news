package com.example.news.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class NewsArticleEntity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

	@Column
	private String header;

	@Column
	private String shortDesc;

	@Column
	private String text;

	@Temporal(TemporalType.DATE)
	@Column
	private Date publishDate;

	
	@Version
	private long version;

	@ElementCollection
	private List<String> keywords;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AUTHOR_ID")
	private ArticleAuthorEntity author;
	
	
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


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getHeader() {
		return header;
	}


	public void setHeader(String header) {
		this.header = header;
	}


	public Date getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}


	public long getVersion() {
		return version;
	}


	public void setVersion(long version) {
		this.version = version;
	}


	public List<String> getKeywords() {
		return keywords;
	}


	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}


	public ArticleAuthorEntity getAuthor() {
		return author;
	}


	public void setAuthor(ArticleAuthorEntity authorA) {
		this.author = authorA;
	}

	
	
	
}
