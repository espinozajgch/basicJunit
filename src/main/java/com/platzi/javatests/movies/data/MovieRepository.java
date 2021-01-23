package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);
    Movie findByNameLike(String name);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
