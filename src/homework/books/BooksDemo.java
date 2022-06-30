package homework.books;

import homework.books.command.Commands;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BooksDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Commands.printCommands();
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
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_AUTHOR_BY_GENDER:
                    printAuthorsByGender();
                    break;
                case PRINT_AUTHOR_BY_EMAIL:
                    printAuthorsByEmail();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Please, try again");
            }
        }
    }

    private static void addBooks() {
        if (authorStorage.getSize() == 0) {
            System.out.println("Please add the author");
            addAuthor();
            addBooks();
        } else {
            authorStorage.print();
            System.out.println("Please choose the index");
            int index = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(index);
            if (author == null) {
                System.out.println("Incorrect index, try again");
                addBooks();
            } else {
                System.out.println("Please input the title of the books");
                String title = scanner.nextLine();

                System.out.println("Please input the number of books");
                double count = Double.parseDouble(scanner.nextLine());

                System.out.println("Please input the genre of the book");
                String genre = scanner.nextLine();

                System.out.println("Please input the price of the book");
                double price = Double.parseDouble(scanner.nextLine());

                Book book = new Book(title, author, count, genre, price);
                bookStorage.add(book);
                System.out.println("Thank you, the book was added");
            }
        }
    }

    private static void bookByAuthor() {
        System.out.println("Please input your favorite author");
        String author = scanner.nextLine();
        if (author != null && !author.trim().equals("")) {
            bookStorage.bookByAuther(author);
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

    private static void addAuthor() {
        System.out.println("Please input author's name");
        String name = scanner.nextLine();

        System.out.println("Please input author's surname");
        String surname = scanner.nextLine();

        System.out.println("Please input the authors's email address");
        String email = scanner.nextLine();

        System.out.println("Please input the author's gender");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, email, gender);
        authorStorage.add(author);
        System.out.println("Thank you, the author was added");
    }

    private static void printAuthorsByGender() {
        System.out.println("Please input the gender");
        String gender = scanner.nextLine();
        if (gender != null && !gender.trim().equals("")) {
            authorStorage.authorByGender(gender);
        }
    }

    private static void printAuthorsByEmail() {
        System.out.println("Please input the email address");
        String email = scanner.nextLine();
        if (email != null && !email.trim().equals("")) {
            authorStorage.authorByEmail(email);
        }
    }
}

