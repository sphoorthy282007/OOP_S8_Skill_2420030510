package skill4;

public class book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book Details:\n" +
               "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Price: $" + price;
    }
}