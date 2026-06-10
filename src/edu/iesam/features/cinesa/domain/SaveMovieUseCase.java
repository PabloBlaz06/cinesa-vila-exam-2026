package edu.iesam.features.cinesa.domain;

public class SaveMovieUseCase {
    private final MovieRepository movieRepository;

    public SaveMovieUseCase(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public void execute(Movie movie){
        movieRepository.save(movie);
    }
}
