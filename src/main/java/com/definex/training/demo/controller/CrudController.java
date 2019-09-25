package com.definex.training.demo.controller;

import com.definex.training.demo.entity.Movie;
import com.definex.training.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author OnurCil on 25/09/2019
 * @project demo
 */

@RestController
@RequestMapping("/api/movies")
public class CrudController {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/title/{movieTitle}")
    public List<Movie> findByTitle(@PathVariable String movieTitle) {
        return movieRepository.findByAbc(movieTitle);
    }
}
