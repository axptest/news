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
@RequestMapping("/author")
public class ArticleAuthorController {

	
	/*
 
	list all articles for a given author  
	list all articles for a given period  
	find all articles for a specific keyword  
	*/
	
	
		@RequestMapping(method=RequestMethod.GET)
	    @ResponseBody
	   List<NewsArticle> getAllNews() {
			List<NewsArticle> allNews = new ArrayList<NewsArticle>();
			allNews.add(new NewsArticle());
	        return allNews;
	    }
		
		@RequestMapping(method=RequestMethod.POST)
	    @ResponseBody
	    void putNews(@RequestParam(value="news", required=true) NewsArticle news) {
			
	    }
		
		@RequestMapping("/{id}")
	    @ResponseBody
	    NewsArticle getNews(@RequestParam(value="id", required=true, defaultValue="0") String name) {
			return new NewsArticle();
	    }
	}
