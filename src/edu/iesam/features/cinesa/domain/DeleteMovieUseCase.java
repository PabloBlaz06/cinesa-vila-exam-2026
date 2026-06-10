package edu.iesam.features.cinesa.domain;

public class DeleteMovieUseCase {
    private final MovieRepository movieRepository;

    public DeleteMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void execute(String movieId){
        movieRepository.delete(movieId);
    }
}
