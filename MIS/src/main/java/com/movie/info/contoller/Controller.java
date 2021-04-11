package com.movie.info.contoller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.info.model.MovieInfo;

@RestController
@RequestMapping("/movies")
public class Controller {
	
	@RequestMapping("/{movieId}")
	public MovieInfo getMovieInfo(@PathVariable("movieId") String movieId) {
	
		return new MovieInfo("1234","moviename");
		
	}
}
