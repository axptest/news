package com.example.news.endpoints;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.news.dto.NewsArticle;

@Controller
@EnableAutoConfiguration
@RequestMapping("/api/author")
public class ArticleAuthorController {

	
	/*
	*  List all articles for a given author  - from the authors point of view
	*  (Assumption is that author is an aggregate)
	*/
		@RequestMapping(method=RequestMethod.GET)
	    @ResponseBody
	   List<NewsArticle> getAllAuthors() {
			List<NewsArticle> allNews = new ArrayList<NewsArticle>();
			allNews.add(new NewsArticle());
	        return allNews;
	    }
		
		@RequestMapping("/{id}/news")
	    @ResponseBody
	    List<NewsArticle> getNews(@RequestParam(value="id", required=true, defaultValue="0") String name) {
			List<NewsArticle> allNews = new ArrayList<NewsArticle>();
			allNews.add(new NewsArticle());
			return allNews;
	    }
	}
