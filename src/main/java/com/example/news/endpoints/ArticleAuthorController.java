package com.example.news.endpoints;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.news.dto.ArticleAuthor;
import com.example.news.dto.NewsArticle;
import com.example.news.services.AuthorService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(basePath = "/api/author", value = "Authors", description = "Operations with Authors", produces = "application/json")
@RestController
@Controller
@EnableAutoConfiguration
@RequestMapping("/api/author")
public class ArticleAuthorController {

	@Autowired
	AuthorService authorService;
	
	/*
	*  List all articles for a given author  - from the authors point of view
	*  (Assumption is that author is an aggregate)
	*/
		@RequestMapping(value="/",method=RequestMethod.GET)
	    @ResponseBody
	    @ApiOperation(value = "Get all authors", notes = "Get authors")
	   List<ArticleAuthor> getAllAuthors() {
	        return authorService.findAllAuthors();
	    }
		
		
		@RequestMapping(value="/{id}/news",method=RequestMethod.GET)
		 @ApiOperation(value = "Get news for a given author", notes = "Get news by author")
	    @ResponseBody
	    List<NewsArticle> getNews(@RequestParam(value="id", required=true) Long id) {
			return authorService.findAuthorNews(id);
	    }
	}
