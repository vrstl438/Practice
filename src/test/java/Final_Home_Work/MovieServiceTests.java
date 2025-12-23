package Final_Home_Work;

import HomeTasks.Final_HomeTasks.Task_4.Movie;
import HomeTasks.Final_HomeTasks.Task_4.MovieService;
import HomeTasks.Final_HomeTasks.Task_4.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTests {

    private MovieService<Number> movieService;
    private Movie movie;
    private Movie movie1;
    private Movie movie2;
    private Movie movie3;

    @BeforeEach
    void setUp(){
        movieService = new MovieService();
        movie1 = new Movie("Бригада");
        movie2 = new Movie("Папины дочки");
        movie3 = new Movie("Воронины");
    }


    @DisplayName("Добавление рейтинга") @Test
    void addRatingTest(){
        movieService.addRating(movie1, new Rating(8));
        movieService.addRating(movie1, new Rating(10));

        assertEquals(2, movieService.getRatingContainer().get(movie1).size());
    }

    @DisplayName("Добавление невалидного рейтинга") @Test
    void addRaringInvalidRating(){
        assertThrows(IllegalArgumentException.class, () -> movieService.addRating(movie1, new Rating<>(11)));
        assertThrows(IllegalArgumentException.class, () -> movieService.addRating(movie1, new Rating<>(0)));
        assertThrows(IllegalArgumentException.class, () -> movieService.addRating(movie1, new Rating<>(-12)));
    }

    @DisplayName("Расчет средней оценки фильма") @Test
    void sortedRatingTest(){
        movieService.addRating(movie1, new Rating(8));
        movieService.addRating(movie1, new Rating(10));
        assertEquals(9, movieService.sortedRating(movie1));
    }

    @DisplayName("Расчет средней оценки у фильма без оценок") @Test
    void sortedRatingAtNullMovie(){
        assertThrows(NullPointerException.class,() -> movieService.sortedRating(movie1));
    }

    @DisplayName("Сортировка по популярности") @Test
    void sortedForPopularTest(){
        movieService.addRating(movie1, new Rating<>(5));
        movieService.addRating(movie1, new Rating<>(7));

        movieService.addRating(movie2, new Rating<>(7));
        movieService.addRating(movie2, new Rating<>(7));

        movieService.addRating(movie3, new Rating<>(8));
        movieService.addRating(movie3, new Rating<>(1));

        assertEquals("Бригада", movieService.sortedForPopular().get(1).getTitle());
        assertEquals("Папины дочки", movieService.sortedForPopular().get(0).getTitle());
        assertEquals("Воронины", movieService.sortedForPopular().get(2).getTitle());
    }
}
