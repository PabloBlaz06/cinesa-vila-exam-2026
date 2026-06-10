package edu.iesam.features.cinesa.data; //cambiar por la ruta correcta

import edu.iesam.features.cinesa.domain.Movie;

import java.util.*;

public class MovieMemLocalDataSource {
    private final Map<String,Movie> dataStore = new HashMap<>();
    private static final MovieMemLocalDataSource instance = new MovieMemLocalDataSource();

    private MovieMemLocalDataSource(){
    }

    public static MovieMemLocalDataSource getInstance(){
        return instance;
    }

    public void save(Movie movie) {
        dataStore.put(movie.getId(),movie);
    }

    /*public List<Movie> findAll() {
        return new ArrayList<>(dataStore.values());
    }

    public void delete(String movieId) {
        dataStore.remove(movieId);
    }*/
}
