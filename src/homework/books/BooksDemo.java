package homework.books;

import homework.books.command.Commands;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Gender;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BooksDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        loginPassword();
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
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

    private static void loginPassword() {
        System.out.println("Please, input login and password");
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        if (LOGIN.equals(login) && PASSWORD.equals(password)) {
            return;
        } else {
            System.out.println("Incorrect login or password");
            loginPassword();
        }
    }

    private static void addBooks() {
        if (authorStorage.getSize() == 0) {
            System.out.println("Please add the author");
            addAuthor();
            addBook();
        } else {
            authorStorage.print();
            System.out.println("Do you want to add an author, YES or NO?");
            String answer = scanner.nextLine();
            if (answer.toUpperCase().equals("YES")) {
                addAuthor();
                addBook();
            } else if (answer.toUpperCase().equals("NO")) {
                addBook();
            } else {
                System.out.println("Unclear answer");
            }
        }
    }

    private static void addBook() {
        authorStorage.print();
        System.out.println("Please choose the author's index");
        int index;
        try {
            index = Integer.parseInt(scanner.nextLine());
            try {
                Author author = authorStorage.getAuthorByIndex(index);
                System.out.println("Please input the title of the books");
                String title = scanner.nextLine();

                double count = trueCount();
                System.out.println("Please input the genre of the book");
                String genre = scanner.nextLine();

                double price = truePrice();
                Book book = new Book(title, author, count, genre, price);
                bookStorage.add(book);
                System.out.println("Thank you, the book was added");
            } catch (AuthorNotFoundException e) {
                System.out.println(e.getMessage());
                addBook();
            }
        } catch (NumberFormatException e) {
            System.out.println("Please input only a number");
            addBook();
        }
    }

    private static double trueCount() {
        double count = 0;
        try {
            System.out.println("Please input the number of books");
            count = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only a number");
            trueCount();
        }
        return count;
    }

    private static double truePrice() {
        double price = 0;
        try {
            System.out.println("Please input the price of the book");
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only a number");
            truePrice();
        }
        return price;
    }

    private static void bookByAuthor() {
        System.out.println("Please input your favorite author");
        String author = scanner.nextLine();
        if (author != null && !author.trim().equals("")) {
            bookStorage.bookByAuther(author);
        } else {
            System.out.println("Unclear answer");
        }

    }

    private static void bookByGenre() {
        System.out.println("Please input your favorite genre");
        String genre = scanner.nextLine();
        if (genre != null && !genre.trim().equals("")) {
            bookStorage.bookByGenre(genre);
        } else {
            System.out.println("Unclear answer");
        }
    }

    private static void bookByPriceRange() {
        double min, max;
        try {
            System.out.println("Please input the minimum amount you prefer");
            min = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input the maximum amount you prefer");
            max = Double.parseDouble(scanner.nextLine());
            bookStorage.bookByPriceRange(min, max);
        } catch (NumberFormatException e) {
            System.out.println("Please input only a number");
            bookByPriceRange();
        }
    }

    private static void addAuthor() {
        System.out.println("Please input author's name");
        String name = scanner.nextLine();
        System.out.println("Please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input the authors's email address");
        String email = scanner.nextLine();
        Gender gender = trueGender();
        Author author = new Author(name, surname, email, gender);
        authorStorage.add(author);
        System.out.println("Thank you, the author was added");

    }

    private static Gender trueGender() {
        try {
            System.out.println("Please input the author's gender");
            String g = scanner.nextLine();
            Gender gender = Gender.valueOf(g.toUpperCase());
            if (gender.equals(Gender.FEMALE) || gender.equals(Gender.MALE)) {
                return gender;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect gender");
            trueGender();
        }
        return null;
    }

    private static void printAuthorsByGender() {
        System.out.println("Please input the gender");
        String gender = scanner.nextLine();
        if (gender != null && !gender.trim().equals("")) {
            authorStorage.authorByGender(gender);
        } else {
            System.out.println("Unclear answer");
        }
    }

    private static void printAuthorsByEmail() {
        System.out.println("Please input the email address");
        String email = scanner.nextLine();
        if (email != null && !email.trim().equals("")) {
            authorStorage.authorByEmail(email);
        } else {
            System.out.println("Unclear answer");
        }
    }
}

