package edu.iesam.features.cinesa.data;

import edu.iesam.features.cinesa.domain.Movie;
import edu.iesam.features.cinesa.domain.MovieRepository;

public class MovieDataRepository implements MovieRepository {
    private final MovieMemLocalDataSource localSource;

    public MovieDataRepository(MovieMemLocalDataSource localSource) {
        this.localSource = localSource;
    }

    @Override
    public void save(Movie movie) {
        localSource.save(movie);
    }


}
