package edu.iesam.features.cinesa;

import edu.iesam.features.cinesa.presentation.MovieView;

public class Main {
    public static void main(String[] args) {

        MovieView.saveMovieUseCase();
        MovieView.getMoviesUsecase();
        MovieView.deleteMovieUseCase();
    }
}