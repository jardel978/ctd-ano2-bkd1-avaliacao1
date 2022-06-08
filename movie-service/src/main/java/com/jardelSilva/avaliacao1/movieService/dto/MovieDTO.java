package com.jardelSilva.avaliacao1.movieService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO implements Serializable {

    private static final long serialVersionUUID = 1L;

    private Long id;
    private String name;
    private String genre;
    private String urlStream;

}
