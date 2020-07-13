package jqka.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
	



@RestController
@CrossOrigin


//@Named
@RequestMapping("/api/test")
public class ArticleController {

  @Value("${key}")
  private String key;

  @GetMapping(path="/list")
  public List<Article> test() {
	  
	 System.out.println("key " + key);
    List<Article> list = new ArrayList<Article>();
     
    for(int i=1; i<=10; i++) {
            Article article = new Article();
            article.setSeq(i);
            article.setText("This is text");
            article.setTitle("This is title");
            article.setWriter("I am writer");
             
            list.add(article);
    }
    System.out.println("key " + key);
    System.out.println("key " + key);
    System.out.println("key " + key);
    System.out.println("key " + key);
    System.out.println("key " + key);System.out.println("key " + key);System.out.println("key " + key);System.out.println("key " + key);
    
    return list;
  }
 
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

