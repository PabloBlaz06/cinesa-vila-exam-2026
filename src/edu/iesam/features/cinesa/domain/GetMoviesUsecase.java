package edu.iesam.features.cinesa.domain;

import java.util.List;

public class GetMoviesUsecase {

    private final MovieRepository movieRepository;

    public GetMoviesUsecase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> execute(){
        return movieRepository.getAll();
    }
}
