package homework.books;

import java.util.Scanner;

public class BooksDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please, input " + EXIT + " for exit");
            System.out.println("Please, input " + ADD_BOOK + " to add a book");
            System.out.println("Please, input " + PRINT_ALL_BOOKS + " to print all the books");
            System.out.println("Please, input " + PRINT_BOOKS_BY_AUTHOR_NAME + " to show all the books by your favorite author");
            System.out.println("Please, input " + PRINT_BOOKS_BY_GENRE + " to show all the books of your favorite genre");
            System.out.println("Please, input " + PRINT_BOOKS_BY_PRICE_RANGE + " to show all the books at a specified price");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBooks();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    bookByAuthor();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    bookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    bookByPriceRange();
                    break;
                default:
                    System.out.println("Please, try again");
            }
        }
    }

    private static void bookByAuthor() {
        System.out.println("Please input your favorite author");
        String author = scanner.nextLine();
        if (author != null && !author.trim().equals("")) {
            bookStorage.bookByAuthor(author);
        }
    }

    private static void bookByGenre() {
        System.out.println("Please input your favorite genre");
        String genre = scanner.nextLine();
        if (genre != null && !genre.trim().equals("")) {
            bookStorage.bookByGenre(genre);
        }
    }

    private static void bookByPriceRange() {
        System.out.println("Please input the minimum amount you prefer");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input the maximum amount you prefer");
        double max = Double.parseDouble(scanner.nextLine());
        bookStorage.bookByPriceRange(min, max);
    }

    private static void addBooks() {
        System.out.println("Please input the title of the books");
        String title = scanner.nextLine();

        System.out.println("Please input the name of the author of the book");
        String authorName = scanner.nextLine();

        System.out.println("Please input the number of books");
        double count = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input the genre of the book");
        String genre = scanner.nextLine();

        System.out.println("Please input the price of the book");
        int price = Integer.parseInt(scanner.nextLine());

        Books book = new Books(title, authorName, count, genre, price);
        bookStorage.add(book);
        System.out.println("Thank you, the book was added");
    }
}
