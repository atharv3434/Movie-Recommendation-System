import java.util.*;

public class MovieDatabase {
    private static final Map<String, List<String>> movies = new HashMap<>();

    public static void addMovie(String title, String genre) {
        movies.putIfAbsent(genre, new ArrayList<>());
        movies.get(genre).add(title);
    }

    public static List<String> getRecommendations(String genre) {
        return movies.getOrDefault(genre, new ArrayList<>());
    }
}
