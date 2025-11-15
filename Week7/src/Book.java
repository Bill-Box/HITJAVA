public class Book {
        private String isbn;
        private String title;
        private String author;
        private int year;
        private double price;

        public Book(String isbn, String title, String author, int year, double price){
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.year = year;
            this.price = price > 0 ? price : 0;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getBookInfo(){
            return String.format("ISBN: %s | Title: %s | Author: %s | Year: %d | Price: %.2f",
                    isbn, title, author, year, price);
        }

        public double getDiscountedPrice(double discountPercentage){
            return price - (price * discountPercentage / 100);
        }

}
