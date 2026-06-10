package edu.iesam.features.cinesa.data;

import edu.iesam.features.cinesa.domain.Movie;
import edu.iesam.features.cinesa.domain.MovieRepository;

import java.util.List;

public class MovieDataRepository implements MovieRepository {
    private final MovieMemLocalDataSource localSource;

    public MovieDataRepository(MovieMemLocalDataSource localSource) {
        this.localSource = localSource;
    }

    @Override
    public void save(Movie movie) {
        localSource.save(movie);
    }

    @Override
    public List<Movie> getAll() {
        return localSource.findAll();
    }


     public void delete(String movieId){
        localSource.delete(movieId);
    }


}
