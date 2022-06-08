package com.jardelSilva.avaliacao1.movieService.repository;

import com.jardelSilva.avaliacao1.movieService.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findAllByGenreContainsIgnoreCase(String genre);

}
