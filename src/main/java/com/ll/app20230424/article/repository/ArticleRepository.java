package com.ll.app20230424.article.repository;

import com.ll.app20230424.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}