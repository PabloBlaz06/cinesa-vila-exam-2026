package edu.iesam.features.cinesa.presentation;

import edu.iesam.features.cinesa.data.MovieDataRepository;
import edu.iesam.features.cinesa.data.MovieMemLocalDataSource;
import edu.iesam.features.cinesa.domain.DeleteMovieUseCase;
import edu.iesam.features.cinesa.domain.GetMoviesUsecase;
import edu.iesam.features.cinesa.domain.MovieRepository;
import edu.iesam.features.cinesa.domain.SaveMovieUseCase;

public class MovieView {

    private static final MovieRepository movierepository = new MovieDataRepository(MovieMemLocalDataSource.getInstance());

    public static SaveMovieUseCase saveMovieUseCase (){
        return new SaveMovieUseCase(movierepository);
    }

    public static GetMoviesUsecase getMoviesUsecase(){
        return new GetMoviesUsecase(movierepository);
    }

    public static DeleteMovieUseCase deleteMovieUseCase(){
        return new DeleteMovieUseCase(movierepository);
    }
}
