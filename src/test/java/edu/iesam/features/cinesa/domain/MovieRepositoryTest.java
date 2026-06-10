package test.java.edu.iesam.features.cinesa.domain;

import edu.iesam.features.cinesa.domain.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MovieRepositoryTest {
    private MovieRepository repository;
    private GetMoviesUsecase getMoviesUsecase;
    private SaveMovieUseCase addMovieUseCase;
    private DeleteMovieUseCase deleteMovieUseCase;

    @Test
    public void AddMovieSuccessfullyTest(){
       Movie movie1 = new Movie("tt0133093", "Paco" ,"terror",123);
       Movie movie2 = new Movie("tt0133094", "Paco y sus amigos" ,"si",163);

       List<Movie> films = getMoviesUsecase.execute(movie1);
       List<Movie> films2 = getMoviesUsecase.execute(movie2);


       assertEquals(1, films.size());
       assertEquals("Paco",films.get(0).getTitulo());

       assertEquals(2, films2.size());
       assertEquals("Paco y sus vecinos",films2.get(0).getTitulo());
   }

   @Test
   public void GetMovieFromListTest(){
        Movie movie = new Movie("tt0133093", "Paco" ,"terror",123);

        List<Movie> film = getMoviesUsecase.execute(movie);

        assertTrue(film.isEmpty());
   }

   @Test
   public void InvalidMoviesTest(){
        assertThrows(IllegalArgumentException.class, () ->{
            Movie movie = new Movie("tt0133093", "Paco" ,"terror",123);
        });

   }


}