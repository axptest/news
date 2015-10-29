package com.example.news.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.news.entity.ArticleAuthorEntity;



public interface AuthorRepository extends CrudRepository<ArticleAuthorEntity, Long>  {
}

