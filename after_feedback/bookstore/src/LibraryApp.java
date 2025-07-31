import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int option;

        do {
            System.out.println("\n====== Menu ======");
            System.out.println("1. Register book");
            System.out.println("2. Borrow book");
            System.out.println("3. Give back book");
            System.out.println("4. Retrieve available books");
            System.out.println("5. Retrieve borrowed books");
            System.out.println("6. Search book by title or author");
            System.out.println("0. Quit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Clean buffer

            switch (option) {
                case 1:
                    System.out.print("Enter the ISBN: ");
                    int isbn = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(isbn, title, author));
                    System.out.println("Book registered successfully.");
                    break;

                case 2:
                    System.out.print("Enter the book ISBN to borrow : ");
                    int borrowIsbn = scanner.nextInt();
                    if (library.borrowBook(borrowIsbn)) {
                        System.out.println("Book borrowed successfully.");
                    } else {
                        System.out.println("Book not found or already borrowed.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the book ISBN to give back: ");
                    int returnIsbn = scanner.nextInt();
                    if (library.returnBook(returnIsbn)) {
                        System.out.println("Book given back successfully.");
                    } else {
                        System.out.println("Book not found or was not borrowed.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Available books ---");
                    library.listBooks(true);
                    break;

                case 5:
                    System.out.println("\n--- Borrowed books ---");
                    library.listBooks(false);
                    break;

                case 6:
                    System.out.print("Enter the title or author: ");
                    String keyword = scanner.nextLine();
                    library.searchBooks(keyword);
                    break;

                case 0:
                    System.out.println("Finish program..");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 0);

        scanner.close();
    }
}
