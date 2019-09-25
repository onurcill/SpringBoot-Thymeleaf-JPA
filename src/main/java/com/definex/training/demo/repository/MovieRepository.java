package com.definex.training.demo.repository;

import com.definex.training.demo.entity.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author OnurCil on 25/09/2019
 * @project demo
 */
public interface MovieRepository extends CrudRepository<Movie,Long> {
    List<Movie> findByAbc(String title);

    //List<Movie> findByProducer(String producer);
}
