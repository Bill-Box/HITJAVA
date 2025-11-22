package model;

public class Novel extends Book {
    private String genre;

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(String id, String title, String author, double price, int quantity, String genre) {
        super(id, title, author, price, quantity);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Novel {" + " ID='" + getId() + '\'' +
                ", Title='" + getTitle() + '\'' +
                ", Author='" + getAuthor() + '\'' +
                ", Price=" + getPrice() +
                ", Quantity=" + getQuantity() +
                " Genre='" + genre + '\'' +
                '}';
    }
}
