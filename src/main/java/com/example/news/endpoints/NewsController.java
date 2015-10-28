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
@RequestMapping("/news")
public class NewsController {

	
	/*
	allow an editor to create/update/delete an article  
	display one article  
	list all articles for a given period  
	find all articles for a specific keyword  
	*/
	
	
		@RequestMapping(method=RequestMethod.GET)
	    @ResponseBody
	   List<NewsArticle> getNews(@RequestParam(value="keyword", required=true) String keyword,
			   					 @RequestParam(value="dateFrom", required=true, defaultValue="none") String dateFrom,
			   					@RequestParam(value="dateFrom", required=true, defaultValue="none") String dateTo
			   ) {
			if(keyword !=null) {
				
			}
				
			List<NewsArticle> allNews = new ArrayList<NewsArticle>();
			allNews.add(new NewsArticle());
	        return allNews;
	    }
		
		@RequestMapping(method=RequestMethod.POST)
	    @ResponseBody
	    void addNews(@RequestParam(value="news", required=true) NewsArticle news) {
			
	    }
		
		@RequestMapping(method=RequestMethod.DELETE)
	    @ResponseBody
	    void DeleteNews(@RequestParam(value="id", required=true) String newsId) {
			
	    }
		
		
		@RequestMapping("/{id}")
	    @ResponseBody
	    NewsArticle getNewsArticle(@RequestParam(value="id", required=true, defaultValue="0") String name) {
			return new NewsArticle();
	    }
	}
