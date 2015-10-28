package com.example.news.endpoints;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.news.dto.NewsArticle;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Api(basePath = "/api/author", value = "Authors", description = "Operations with Authors", produces = "application/json")
@RestController
@Controller
@EnableAutoConfiguration
@RequestMapping("/api/author")
public class ArticleAuthorController {

	
	/*
	*  List all articles for a given author  - from the authors point of view
	*  (Assumption is that author is an aggregate)
	*/
		@RequestMapping(value="/",method=RequestMethod.GET)
	    @ResponseBody
	    @ApiOperation(value = "Get all authors", notes = "Get authors")
	   List<NewsArticle> getAllAuthors() {
			List<NewsArticle> allNews = new ArrayList<NewsArticle>();
			allNews.add(new NewsArticle());
	        return allNews;
	    }
		
		
		@RequestMapping(value="/{id}/news",method=RequestMethod.GET)
		 @ApiOperation(value = "Get news for a given author", notes = "Get news by author")
	    @ResponseBody
	    List<NewsArticle> getNews(@RequestParam(value="id", required=true, defaultValue="0") String name) {
			List<NewsArticle> allNews = new ArrayList<NewsArticle>();
			allNews.add(new NewsArticle());
			return allNews;
	    }
	}
