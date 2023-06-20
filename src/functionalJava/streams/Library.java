package functionalJava.streams;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("D");
        }).filter(book -> {
            return book.getTitle().contains("o");
        }).forEach(System.out::println);

    }

    private static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Dostoevsky", "The Idiot"));
        books.add(new Book("Dostoevsky", "CrimeAndPunishment"));
        return books;
    }
}
