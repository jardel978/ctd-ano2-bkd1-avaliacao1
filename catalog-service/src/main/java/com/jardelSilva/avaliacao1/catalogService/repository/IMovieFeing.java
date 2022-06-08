package com.jardelSilva.avaliacao1.catalogService.repository;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MOVIE-SERVICE")
@LoadBalancerClient(name = "MOVIE-SERVICE")
public interface IMovieFeing {

    @GetMapping("/movies/{genre}")
    Object feingSearchMovieByGenre(@PathVariable(value = "genre") String genre);

}
