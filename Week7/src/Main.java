public class Main {
    public static void main(String[] args) {
            Book b = new Book("978-3-16-148410-0", "Lập trình Java cơ bản", "Nguyễn Văn A", 2020, 300.0);
            System.out.println(b.getBookInfo());
            System.out.printf("Discounted Price: %.2f%n", b.getDiscountedPrice(10)); // Giảm 10
            System.out.printf("Discounted Price 20%%: %.2f%n", b.getDiscountedPrice(20)); // 240
            System.out.printf("Discounted Price 50%%: %.2f%n", b.getDiscountedPrice(50)); // 150
            System.out.println(b.getBookInfo());
            Library lib = new Library(10, 10);
            lib.addBook(b);
            System.out.println(lib.getLibraryInfo());
            LibraryCard card = new LibraryCard("LC001", "Nguyễn An", 12, 5);
            lib.addLibraryCard(card);
            System.out.println(card.toString());
    }
}