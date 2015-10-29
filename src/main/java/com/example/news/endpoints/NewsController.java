package com.example.news.endpoints;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.news.dto.NewsArticle;
import com.example.news.services.NewsService;
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

	@Autowired
	NewsService newsService;
	
	
	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	
	/* 	 
	 * This method fullfills the use cases:
	 * list all articles for a given period  
	 * find all articles for a specific keyword  
	 * 
	 * if the keyword is present, it takes the precedence
	 */
	 	@RequestMapping(value="/",method=RequestMethod.GET)
	    @ResponseBody
	    @ApiOperation(value = "Get News Articles by keyword or date span", notes = "Get News Article")
		@ApiResponses(value = {
	            @ApiResponse(code = 400, message = "wrong parameters")
	            })
	   List<NewsArticle> getNews(@RequestParam(value="keyword", required=false) String keyword,
			   @DateTimeFormat(pattern="yyyy-MM-dd") @RequestParam(value="dateFrom", required=false) Date dateFrom,
			   @DateTimeFormat(pattern="yyyy-MM-dd") @RequestParam(value="dateTo", required=false) Date dateTo
			   ) {
	 		List<NewsArticle> news;
			if(keyword ==null && dateFrom==null &&dateTo==null) {
				news = getNewsService().findAllNews();
			}
			else {
					news = getNewsService().findNews(keyword, dateFrom, dateTo);
			}
		
	        return news;
	    }
	
		/*
		 *  The following methods fulfill the use cases:
		 *  allow an editor to create/update/delete an article  
		*/
		
		@RequestMapping(value="/",method=RequestMethod.POST)
	    @ResponseBody
	    @ResponseStatus(HttpStatus.CREATED)
	    @ApiOperation(value = "Create new News Article", notes = "Creates new News Article")
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Fields are with validation errors"),
	            @ApiResponse(code = 201, message = "") })
	    void addNews(@RequestBody NewsArticle news) {
			getNewsService().addNews(news);
	    }
		
		@RequestMapping(value="/",method=RequestMethod.PUT)
	    @ResponseBody
	    @ApiOperation(value = "udate a News Article", notes = "updates News Article")
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Fields are with validation errors"),
	            @ApiResponse(code = 201, message = "") })
	    void updateNews(@RequestBody NewsArticle news) {
			getNewsService().updateNews(news);
	    }
		
		@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
		@ApiOperation(value = "Delete News Article of given ID", notes = "delete a News Article")
	    @ResponseBody
	    @ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Wrong parameters"),
	            @ApiResponse(code = 201, message = "") })
	    void deleteNews(@RequestParam(value="id", required=true) Long newsId) {
			getNewsService().deleteNews(newsId);
	    }
		
		/*
		 * This method fulfills the use case:
		 * display one article  
		 */
		
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		@ApiOperation(value = "Get News Article of given ID", notes = "get a News Article")
		@ApiResponses(value = {
	            @ApiResponse(code = 400, message = "Wrong News Article ID"),
	            @ApiResponse(code = 201, message = "") })
	    @ResponseBody
	    NewsArticle getNewsArticle(@RequestParam(value="id", required=true) Long id) {
			return getNewsService().getNews(id);
	    }
	}
