package Final_HomeTasks.Task_4;

import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

@ToString
public class MovieService <T extends Number> {
    private Map<Movie, List<Rating>> ratingContainer = new HashMap<>();

    public Map<Movie, List<Rating>> getRatingContainer() {
        return ratingContainer;
    }


    public synchronized void addRating(Movie movie, Rating<T> rating){
        ratingContainer.computeIfAbsent(movie, m -> new CopyOnWriteArrayList<>())
                .add(rating);
    }

    public synchronized Double sortedRating(Movie movie){
        return ratingContainer.get(movie).stream()
                .mapToDouble(a -> a.getRating().doubleValue())
                .average()
                .orElseThrow(() -> new NullPointerException("rating isEmpty - " + movie.getTitle()));
    }

    public synchronized List<Movie> sortedForPopular(){
        return ratingContainer.keySet().stream()
                .sorted(Comparator.comparingDouble(this::sortedRating)
                        .reversed())
                .collect(Collectors.toList());
    }
}
