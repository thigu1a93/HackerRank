package com.hackerrank.movietitle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.hackerrank.movietitle.model.SearchResult;
/*
 * 1.create a rest template
 * 2. 
*/
@SpringBootApplication
public class MovietitleApplication {

	private static final Logger log=LoggerFactory.getLogger(MovietitleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MovietitleApplication.class, args);
		getMovieTitles("spiderman");
	}
	private static void getMovieTitles(String string) {
		int page=0,TotalPages=1000;
		List<String> moviewTitles = new ArrayList<String>();
		RestTemplate temp=new RestTemplate();
		while(page<=TotalPages) {
			page=page+1;
				SearchResult result=temp.getForObject(
                "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + string + "&page=" + page,
                SearchResult.class);
		moviewTitles.addAll(result.getData().stream().map(t -> t.getTitle()).collect(Collectors.toList()));
		page=Integer.parseInt(result.getPage());
		TotalPages=Integer.parseInt(result.getTotal());
		}
		moviewTitles.sort((name1,name2)->name1.compareTo(name2));
		moviewTitles.forEach(System.out::println);
		System.out.println(moviewTitles.size());
		
		
	
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	/*@Bean
	public ApplicationRunner run(RestTemplate restTemplate) throws Exception{
		List<String> moviewTitles = new ArrayList<String>();		
		return args ->{SearchResult result=restTemplate.getForObject(
                "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + "spiderman" + "&page=" + 1,
                SearchResult.class);
		moviewTitles.addAll(result.getData().stream().map(t -> t.getTitle()).collect(Collectors.toList()));
		moviewTitles.sort((name1,name2)->name1.compareTo(name2));
		moviewTitles.forEach(System.out::println);
			
		};
		log.info(result.toString());
		
	
		}*/
}
	

