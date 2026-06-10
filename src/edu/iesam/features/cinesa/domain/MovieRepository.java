package edu.iesam.features.cinesa.domain;

import java.util.List;

public interface MovieRepository {

    void save(Movie movie);
    List<Movie> getAll();
    void delete(String movieId);
}
