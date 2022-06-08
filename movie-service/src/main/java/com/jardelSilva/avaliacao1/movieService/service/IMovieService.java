package com.jardelSilva.avaliacao1.movieService.service;

import com.jardelSilva.avaliacao1.movieService.dto.MovieDTO;

import java.util.List;

public interface IMovieService {

    void saveMovie(MovieDTO movieDTO);

    List<MovieDTO> findAllByGenre(String genre);

}
