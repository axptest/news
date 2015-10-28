package com.example.news.endpoints;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.news.dto.NewsArticle;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Api(basePath = "/api/news", value = "NewsArticles", description = "Operations with News Articles", produces = "application/json")
@Controller
@RestController
@EnableAutoConfiguration
@RequestMapping("/api/news")
public class NewsController {

	
	/* 	 
	 * This method fullfills the use cases:
	 * list all articles for a given period  
	 * find all articles for a specific keyword  
	 */
	 
		@RequestMapping(method=RequestMethod.GET)
	    @ResponseBody
	    @ApiOperation(value = "Get News Articles", notes = "get News Article")
		@ApiResponses(value = {
	            @ApiResponse(code = 400, message = "parameters missing")
	            })
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
	
		/*
		 *  This method fullfills the use cases:
		 *  allow an editor to create/update/delete an article  
		*/
		
		@RequestMapping(method=RequestMethod.POST)
	    @ResponseBody
	    @ResponseStatus(HttpStatus.CREATED)
	    @ApiOperation(value = "Create new News Article", notes = "Creates new News Article")
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Fields are with validation errors"),
	            @ApiResponse(code = 201, message = "") })
	    void addNews(@RequestParam(value="news", required=true) NewsArticle news) {
			
	    }
//		
//		@RequestMapping(method=RequestMethod.DELETE)
//	    @ResponseBody
//	    void DeleteNews(@RequestParam(value="id", required=true) String newsId) {
//			
//	    }
//		
//		/*
//		 * This method fullfills the use case:
//		 * display one article  
//		 */
//		
//		@RequestMapping("/{id}")
//	    @ResponseBody
//	    NewsArticle getNewsArticle(@RequestParam(value="id", required=true, defaultValue="0") String name) {
//			return new NewsArticle();
//	    }
	}
