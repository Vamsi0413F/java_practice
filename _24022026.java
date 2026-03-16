class Book {
    String title;

    // Constructor
    Book(String title) {
        this.title = title;
    }

    // Getter method
    String getTitle() {
        return title;
    }
}

public class _24022026 {
    public static void main(String[] args) {

        Book[] library = new Book[3];

        library[0] = new Book("Java Fundamentals");
        library[1] = new Book("Clean Code");
        // library[2] is left null

        for (int i = 0; i < library.length; i++) {

            if (library[i] != null) {
                System.out.println("Book " + i + ": " + library[i].getTitle());
            } else {
                System.out.println("Book " + i + ": [Empty Slot]");
            }
        }
    }
}