package com.jardelSilva.avaliacao1.movieService.service;

import com.jardelSilva.avaliacao1.movieService.dto.MovieDTO;
import com.jardelSilva.avaliacao1.movieService.model.Movie;
import com.jardelSilva.avaliacao1.movieService.repository.IMovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private IMovieRepository movieRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveMovie(MovieDTO movieDTO) {
        Movie movieModel = modelMapper.map(movieDTO, Movie.class);
        movieRepository.save(movieModel);
    }

    @Override
    public List<MovieDTO> findAllByGenre(String genre) {
        List<Movie> movieModelList = movieRepository.findAllByGenreContainsIgnoreCase(genre);
        return movieModelList.stream().map(movieModel -> modelMapper.map(movieModel, MovieDTO.class)).collect(Collectors.toList());
    }

}
