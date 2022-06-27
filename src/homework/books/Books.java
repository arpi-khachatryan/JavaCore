package homework.books;

public class Books {
    private String title;
    private String authorName;
    private double count;
    private String genre;
    private int price;

    public Books(String title, String authorName, double count, String genre, int price) {
        this.title = title;
        this.authorName = authorName;
        this.count = count;
        this.genre = genre;
        this.price = price;
    }

    public Books() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}