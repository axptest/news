package com.example.news;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.news.entity.ArticleAuthorEntity;
import com.example.news.entity.NewsArticleEntity;
import com.example.news.repos.AuthorRepository;
import com.example.news.repos.NewsArticleRepository;
import com.mangofactory.swagger.plugin.EnableSwagger;

/**
 * Main class for running the application.
 *
 */
@SpringBootApplication
@EnableSwagger
@Configuration
@ComponentScan("com.example.news")
@EnableAutoConfiguration
public class NewsApp implements CommandLineRunner
{
	
	@Autowired NewsArticleRepository articleRepository;
	@Autowired AuthorRepository authorRepository;
	
	
	    public static void main(String[] args) throws Exception {
	          ApplicationContext ctx = SpringApplication.run(NewsApp.class, args); 
	        
	    }

	    @Autowired
	    JdbcTemplate jdbcTemplate;

	    @Override
	    public void run(String... strings) throws Exception {
	    	ArticleAuthorEntity authorA = new ArticleAuthorEntity();
	    	authorA.setName("Arthur Author");
	    	authorRepository.save(authorA);
	    	
	    	ArticleAuthorEntity authorB = new ArticleAuthorEntity();
	    	authorB.setName("Lex Author");
	    	authorRepository.save(authorB);
	    	
	    	NewsArticleEntity nea1 = new NewsArticleEntity ();
	    	nea1.setPublishDate(new Date());
	    	nea1.setHeader("Godzilla Attacks Japan!");
	    	nea1.setShortDesc("godzilla attacks Japan");
	    	nea1.setText("total mayhem, cities in ruins");
	    	nea1.setAuthor(authorA);
	    	nea1.setKeywords(Arrays.asList(new String[] {"godzilla","attack", "japan"}));
	    	articleRepository.save(nea1);

	    
	    	
	    	NewsArticleEntity nea2 = new NewsArticleEntity ();
	    	nea2.setShortDesc("man bites dog");
	    	nea2.setHeader("Rabid Man Bites Dog!");
	    	nea2.setPublishDate(new Date(new Date().getTime()-24*60*60*1000));
	    	nea2.setText("the dog in dire need of anti-rabies medication");
	    	nea2.setKeywords(Arrays.asList(new String[] {"dog","rabies", "man"}));
	    	nea2.setAuthor(authorB);
	    	articleRepository.save(nea2);

	    	NewsArticleEntity nea3 = new NewsArticleEntity ();
	    	nea3.setShortDesc("zombie apocalypse");
	    	nea3.setHeader("Zombie Apocalypse Begun!");
	    	nea3.setPublishDate(new Date(new Date().getTime()-2*24*60*60*1000));
	    	nea3.setText("It started with dog. Grab some weapon.");
	    	nea3.setKeywords(Arrays.asList(new String[] {"dog","zombie", "apocalypse"}));
	    	nea3.setAuthor(authorB);
	    	articleRepository.save(nea3);
	    	
	    }
}
