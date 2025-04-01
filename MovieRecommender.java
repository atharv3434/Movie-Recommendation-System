import java.util.*;

public class MovieRecommender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎬 AI-Powered Movie Recommendation System 🎥");

        while (true) {
            System.out.println("\n1. Add a Movie");
            System.out.println("2. Get Movie Recommendations");
            System.out.println("3. Rate a Movie");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Movie Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();
                    MovieDatabase.addMovie(title, genre);
                    System.out.println("✅ Movie added successfully!");
                    break;

                case 2:
                    System.out.print("\nEnter Your Favorite Genre: ");
                    String favGenre = sc.nextLine();
                    List<String> recommendations = MovieDatabase.getRecommendations(favGenre);
                    if (recommendations.isEmpty()) {
                        System.out.println("❌ No movies found in this genre.");
                    } else {
                        System.out.println("\n🎥 Recommended Movies:");
                        for (String movie : recommendations) {
                            System.out.println("- " + movie);
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nEnter Movie Title to Rate: ");
                    String movieTitle = sc.nextLine();
                    System.out.print("Enter Your Rating (1-5): ");
                    int rating = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    UserPreferences.rateMovie(movieTitle, rating);
                    System.out.println("✅ Movie rated successfully!");
                    break;

                case 4:
                    System.out.println("Exiting... Enjoy your movies! 🍿");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
