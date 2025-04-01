import java.util.*;

public class UserPreferences {
    private static final Map<String, Integer> movieRatings = new HashMap<>();

    public static void rateMovie(String movie, int rating) {
        movieRatings.put(movie, rating);
    }

    public static int getRating(String movie) {
        return movieRatings.getOrDefault(movie, 0);
    }
}
