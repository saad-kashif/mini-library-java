import java.util.Scanner;

public class MiniLibrary {
    static String book1 = "";
    static String book2 = "";
    static String book3 = "";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- Mini Library -----");
            System.out.println("1. Add a Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the book to add: ");
                    String bookName = input.nextLine();
                    addBook(bookName);
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    viewBooks();
                    System.out.print("Enter the book number you want to borrow: ");
                    int bookNumber = input.nextInt();
                    borrowBook(bookNumber);
                    break;
                case 4:
                    returnBook(input);
                    break;
                case 5:
                    System.out.println("Exiting Library... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    public static void addBook(String bookName) {
        if (book1.isEmpty()) {
            book1 = bookName;
        } else if (book2.isEmpty()) {
            book2 = bookName;
        } else if (book3.isEmpty()) {
            book3 = bookName;
        } else {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        System.out.println("Book added successfully!");
    }

    public static void viewBooks() {
        System.out.println("Books in Library:");
        if (!book1.isEmpty())
            System.out.println("1. " + book1);
        if (!book2.isEmpty())
            System.out.println("2. " + book2);
        if (!book3.isEmpty())
            System.out.println("3. " + book3);
        if (book1.isEmpty() && book2.isEmpty() && book3.isEmpty()) {
            System.out.println("No books available.");
        }
    }

    public static void borrowBook(int bookNumber) {
        switch (bookNumber) {
            case 1:
                if (!book1.isEmpty()) {
                    System.out.println("You borrowed: " + book1);
                    book1 = "";
                } else {
                    System.out.println("Book 1 is already borrowed or not available.");
                }
                break;
            case 2:
                if (!book2.isEmpty()) {
                    System.out.println("You borrowed: " + book2);
                    book2 = "";
                } else {
                    System.out.println("Book 2 is already borrowed or not available.");
                }
                break;
            case 3:
                if (!book3.isEmpty()) {
                    System.out.println("You borrowed: " + book3);
                    book3 = "";
                } else {
                    System.out.println("Book 3 is already borrowed or not available.");
                }
                break;
            default:
                System.out.println("Invalid book number.");
                break;
        }
    }

    public static void returnBook(Scanner input) {
        System.out.print("Enter book name to return: ");
        String returnedBook = input.nextLine();

        if (book1.isEmpty()) {
            book1 = returnedBook;
        } else if (book2.isEmpty()) {
            book2 = returnedBook;
        } else if (book3.isEmpty()) {
            book3 = returnedBook;
        } else {
            System.out.println("Library is full. Cannot return the book.");
            return;
        }
        System.out.println("Book returned. Thank you!");
    }
}
