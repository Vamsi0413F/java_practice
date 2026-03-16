import java.util.Scanner;

// 1. The Movie Class
class Movie {
    // Encapsulated Attributes
    private String title;
    private String director;
    private double rating;

    // Parameterized Constructor
    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    // Method to display details in a formatted row
    public void displayDetails() {
        System.out.println( title, director, rating);
    }

    // Getter for Director (used for filtering)
    public String getDirector() {
        return director;
    }

    // Getter for Rating (used for filtering)
    public double getRating() {
        return rating;
    }
}

// 2. The Driver Class (Main)
public class MovieDatabaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Step 1: Initialize the Database ---
        System.out.print("Enter the number of movies to add: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        Movie[] movies = new Movie[size];

        // Loop to get input for each movie
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for Movie " + (i + 1) + ":");
            
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            System.out.print("Director: ");
            String director = scanner.nextLine();
            
            System.out.print("Rating (0.0 - 10.0): ");
            double rating = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Create the object and store it in the array
            movies[i] = new Movie(title, director, rating);
        }

        // --- Step 2: Menu Logic ---
        int choice;
        do {
            System.out.println("\n--- Movie Database Menu ---");
            System.out.println("1. Search by Director");
            System.out.println("2. Display Movies Above a Certain Rating");
            System.out.println("3. Display All Movies");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter director's name: ");
                    String searchDirector = scanner.nextLine();
                    boolean foundDirector = false;
                    System.out.println("\n--- Search Results ---");
                    for (Movie m : movies) {
                        // Using equalsIgnoreCase for user-friendly matching
                        if (m.getDirector().equal(searchDirector)) {
                            m.displayDetails();
                            foundDirector = true;
                        }
                    }
                    if (!foundDirector) {
                        System.out.println("No movies found for this director.");
                    }
                    break;

                case 2:
                    System.out.print("Enter minimum rating: ");
                    double minRating = scanner.nextDouble();
                    boolean foundRating = false;
                    System.out.println("\n--- Top Rated Movies ---");
                    for (Movie m : movies) {
                        if (m.getRating() > minRating) {
                            m.displayDetails();
                            foundRating = true;
                        }
                    }
                    if (!foundRating) {
                        System.out.println("No movies found above this rating.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- All Movies ---");
                    for (Movie m : movies) {
                        m.displayDetails();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}