package homework.books;

public class BookStorage {
    private Books[] booksArray = new Books[10];
    private int size = 0;

    public void add(Books book) {
        if (size == booksArray.length) {
            increase();
        }
        booksArray[size++] = book;
    }

    private void increase() {
        Books[] booksNewArray = new Books[booksArray.length * 2];
        for (int i = 0; i < size; i++) {
            booksNewArray[i] = booksArray[i];
        }
        booksArray = booksNewArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + booksArray[i]);
        }
    }

    public void bookByAuthor(String author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (booksArray[i].getAuthorName().equals(author)) {
                System.out.println(booksArray[i]);
                ++count;
            }
        }
        if (count == 0) {
            System.out.println("Sorry, the book was not found");
        }
    }

    public void bookByGenre(String genre) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (booksArray[i].getGenre().equals(genre)) {
                System.out.println(booksArray[i]);
                ++count;
            }
        }
        if (count == 0) {
            System.out.println("Sorry, the book was not found");
        }
    }

    public void bookByPriceRange(int price1, int price2) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (booksArray[i].getPrice() == price1 || booksArray[i].getPrice() == price2) {
                System.out.println(booksArray[i]);
                ++count;
            } else if (price1 > price2) {
                if (booksArray[i].getPrice() < price1 && booksArray[i].getPrice() > price2) {
                    System.out.println(booksArray[i]);
                    ++count;
                }
            } else if (price1 < price2) {
                if (booksArray[i].getPrice() > price1 && booksArray[i].getPrice() < price2) {
                    System.out.println(booksArray[i]);
                    ++count;
                }
            }
        }
        if (count == 0) {
            System.out.println("Sorry, there is no book at that price");
        }
    }
}


