package homework.books.model;

import classwork.students.model.User;

public class Book {
    private String title;
    private Author author;
    private double count;
    private String genre;
    private double price;
    private User registeredUser;

    public Book(String title, Author author, double count, String genre, double price, User registeredUser) {
        this.title = title;
        this.author = author;
        this.count = count;
        this.genre = genre;
        this.price = price;
        this.registeredUser = registeredUser;
    }

    public Book(String title, Author author, double count, String genre, double price, homework.books.model.User currentUser) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName=" + author.getName() +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", registeredUser=" + registeredUser +
                '}';
    }
}
