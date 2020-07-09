package com.example.ckl2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
	 
@RestController
@CrossOrigin
@RequestMapping("/api/test")
public class ArticleController {
   
  //@RequestMapping(value = "/list", method = RequestMethod.GET)
	@GetMapping(path="/list")
  public List<Article> test() {
    List<Article> list = new ArrayList<Article>();
     
    for(int i=1; i<=10; i++) {
            Article article = new Article();
            article.setSeq(i);
            article.setText("This is text");
            article.setTitle("This is title");
            article.setWriter("I am writer");
             
            list.add(article);
    }
    return list;
  }
 
  //@RequestMapping(value = "/article/{seq}", method = RequestMethod.GET)
  @GetMapping(path="/article/{seq}")
  public Article detail(@PathVariable("seq") long seq) {
 
        Article article = new Article();
        article.setSeq(seq);
        article.setText("This is text");
        article.setTitle("This is title");
        article.setWriter("I am writer");
 
    return article;
  }
}

