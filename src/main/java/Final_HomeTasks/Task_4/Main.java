package Final_HomeTasks.Task_4;

public class Main {
    public static void main(String[] args) {
        Movie qwerty = new Movie("qwerty");
        Movie qwerty1 = new Movie("qwerty1");

        MovieService<Number> movieService = new MovieService();

        movieService.addRating(qwerty, new Rating<>(2));
        movieService.addRating(qwerty, new Rating<>(2));
        movieService.addRating(qwerty, new Rating<>(3));
        movieService.addRating(qwerty, new Rating<>(5));

        movieService.addRating(qwerty1, new Rating<>(9));
        movieService.addRating(qwerty1, new Rating<>(3));
        movieService.addRating(qwerty1, new Rating<>(8));

        System.out.println(movieService.sortedRating(qwerty));
        System.out.println(movieService.sortedRating(qwerty1));

        System.out.println(movieService.sortedForPopular().toString());
    }
}
