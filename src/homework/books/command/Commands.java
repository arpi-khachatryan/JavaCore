package homework.books.command;

public interface Commands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR_NAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_AUTHOR_BY_GENDER = 7;
    int PRINT_AUTHOR_BY_EMAIL = 8;
    int CHANGE_AUTHOR_BOOK = 9;
    int PRINT_ALL_AUTHORS = 10;

    static void printCommands() {
        System.out.println("Please, input " + EXIT + " for exit");
        System.out.println("Please, input " + ADD_BOOK + " to add a book");
        System.out.println("Please, input " + PRINT_ALL_BOOKS + " to print all the books");
        System.out.println("Please, input " + PRINT_BOOKS_BY_AUTHOR_NAME + " to show all the books by your favorite author");
        System.out.println("Please, input " + PRINT_BOOKS_BY_GENRE + " to show all the books of your favorite genre");
        System.out.println("Please, input " + PRINT_BOOKS_BY_PRICE_RANGE + " to show all the books at a specified price");
        System.out.println("Please, input " + ADD_AUTHOR + " to add the author");
        System.out.println("Please, input " + PRINT_AUTHOR_BY_GENDER + " to show the author by gender");
        System.out.println("Please, input " + PRINT_AUTHOR_BY_EMAIL + " to show the author by email");
        System.out.println("Please, input " + CHANGE_AUTHOR_BOOK + " to change the author's book");
        System.out.println("Please, input " + PRINT_ALL_AUTHORS + " to show all the authors");
    }
}
