package com.jardelSilva.avaliacao1.catalogService.service;

import com.jardelSilva.avaliacao1.catalogService.repository.IMovieFeing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements ICatalogServece {

    @Autowired
    private IMovieFeing movieFeing;

    @Override
    public Object searchByGenre(String genre) {
        return movieFeing.feingSearchMovieByGenre(genre);
    }
}
