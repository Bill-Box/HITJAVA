import java.util.ArrayList;
import java.util.List;
public class model {

    public class Parcel{
        private String id;
        private String receiver;
        private double weightKg;
        private int distanceKm;
        public Parcel(String id, String receiver, double weightKg, int distanceKm){
            this.id = id;
            this.receiver = receiver;
            this.weightKg = Math.max(0, weightKg);
            this.distanceKm = Math.max(0, distanceKm);
        }
        public double baseFee(){
            return weightKg * 5000;
        }
        public void setId(String id){
            this.id=id;
        }
        public String getId(){
            return id;
        }
        public String getReceiver(){
            return receiver;
        }
        public void setReceiver( String receiver){
            this.receiver = receiver;
        }
        public void setWeightKg(double weightKg){
            this.weightKg = weightKg;
        }
        public void setDistanceKm(int distanceKm){
            this.distanceKm =distanceKm;
        }
        public double distanceFee(){
            return distanceKm * 200;
        }
        public double totalFee(){
            return baseFee() + distanceFee();
        }
        public double getWeightKg(){
            return weightKg;
        }
        public int getDistanceKm(){
            return distanceKm;
        }
        public boolean isHeavy(){
            if(weightKg >= 20){
                return true;
            }
            else return false;
        }
        public String toString(){
            return String.format("%s - %s - %.1fkg - %dkm - fee=%.2f", getId() , getReceiver(), getWeightKg(), getDistanceKm(),totalFee());
        }
        public static void main(String[] args){
            Parcel p = new Parcel("PK001", "Nguyen An", 12.5, 120);
            System.out.printf("%.2f%n", p.baseFee());
            System.out.printf("%.2f%n", p.distanceFee());
            System.out.printf("total=%.2f%n", p.totalFee());
        }

    }

    public class Shipment{
        private Parcel[] items;
        private int count;
        public Shipment(int capacity){
            items = new Parcel[capacity];
            count = 0;
        }
        public Shipment() {
            this(10);
        }

        public void add(Parcel p){
            if (count >= items.length) {
                System.out.println("Mang da day! Khong the them.");
                return;
            }
            items[count++] = p;
        }
        public void add(String id, String receiver, double weightKg, int distanceKm){
            if (count >= items.length) {
                System.out.println("Mang da day! Khong the them.");
                return;
            }
            items[count++] = new Parcel(id, receiver, weightKg, distanceKm);
        }
        public int getSize(){
            return count;
        }
        public int size(){
            return count;
        }
        public Parcel findById(String id){
            for(int i = 0 ; i < count; i++){
                if(items[i].getId().equalsIgnoreCase(id)){
                    return items[i];
                }
            }
            return null;
        }
        public Parcel[] filterByReceiver(String keyword) {
            keyword = keyword.toLowerCase();

            // đếm trước
            int size = 0;
            for (int i = 0; i < count; i++) {
                if (items[i].getReceiver().toLowerCase().contains(keyword)) {
                    size++;
                }
            }

            // tạo mảng kết quả
            Parcel[] result = new Parcel[size];
            int idx = 0;
            for (int i = 0; i < count; i++) {
                if (items[i].getReceiver().toLowerCase().contains(keyword)) {
                    result[idx++] = items[i];
                }
            }
            return result;
        }
        public double totalWeight(){
            double sum =0 ;
            for (int i = 0; i < count; i++) {
                sum += items[i].getWeightKg();
            }
            return sum;
        }
        public Parcel getHeaviest(){
            if (count == 0) return null;

            Parcel maxw = items[0];
            for(int i = 1; i < count; i++){
                if(maxw.getWeightKg() < items[i].getWeightKg()){
                    maxw = items[i];
                }
            }
            return maxw;
        }
        public Parcel heaviest(){
            if (count == 0) return null;

            Parcel maxw = items[0];
            for(int i = 1; i < count; i++){
                if(maxw.getWeightKg() < items[i].getWeightKg()){
                    maxw = items[i];
                }
            }
            return maxw;
        }

        public int countHeavy(){
            int countH =0;
            for(int i = 0; i < count; i++){
                if(items[i].isHeavy()){
                    countH ++;
                }
            }
            return countH;
        }

    }
    public class ShipReport {

        public static String brief(Shipment s) {
            StringBuilder sb = new StringBuilder();

            sb.append("Total items: ").append(s.getSize()).append("\n");
            sb.append(String.format("Total weight: %.2f\n", s.totalWeight()));

            if (s != null) {
                sb.append("Shipment: size=")
                        .append(s.getSize())
                        .append(" | totalWeight=")
                        .append(s.totalWeight())
                        .append(" | heavy=")
                        .append(s.countHeavy());
            }

            return sb.toString();
        }
        public static void main(String[] args){
            Shipment s = new Shipment();
            s.add(new Parcel("PK001","A",10,100));
            s.add("PK002","B",5,50); // overloading
            System.out.println("size=" + s.size());
        }
    }



}


class Library{
    private Book[] books;
    private LibraryCard[] cards;
    private int bookCount;
    private int cardCount;

    public Library(int maxBooks, int maxCards){
        books = new Book[maxBooks];
        cards = new LibraryCard[maxCards];
    }
    public int getbookCount(){
        return bookCount;
    }
    public int getcardCount(){
        return cardCount;
    }

    public boolean addBook(Book book){
        if(getbookCount() < books.length){
            books[bookCount++] = book;
            return true;
        }
        return false;
    }
    public void addBorrowedBook(Book book) {
        brbook.append(book.getBookInfo()).append("\n");
    }

    public boolean addLibraryCard(LibraryCard card){
        if(cardCount < cards.length){
            for(int i = 0; i < cards.length; i++){
                if(card.getHolderName()== cards[i].getHolderName()){
                    return false;
                }
                else{
                    cards[cardCount++] = card;
                    break;
                    return true;
                }
            }
        }
        else return false;
    }
    public boolean borrowBook(LibraryCard card, String isbn){
        if(card.getbrBook().length() < cards.getBookLimit()){
            for(int i  = 0; i < bookCount; i++){
                if(card[i].getIsbn().equalsIgnoreCase(isbn))
                    brbook.append(cards[i]);
                cards[i] = null;
                bookCount--;
                return true;
            }
        }
        return false;
    }
    public String getLibraryInfo(){
        return String.format("Library  BookCount: %s | CardCount: %s ",getbookCount(), getcardCount());
    }
    public static void main(String[] args){
        Book b = new Book("978-3-16-148410-0", "Lập trình Java cơ bản", "Nguyễn Văn A", 2020, 300.0);
        System.out.println(b.getBookInfo());
    }

}
 fix 2
class Book{
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
        if(price > 0){
            this.price = price;
        }
        else{
            this.price = 0;
        }
    }
    public String getBookInfo(){
        return String.format("ISBN:%s | Title:%s | Author:%s | Year:%d | Price:%.1f ", isbn,title,author,year,price);
    }
    public double getDiscountedPrice(double discountPercentage){
        return price * discountPercentage / 100;
    }

}

class LibraryCard{
    private String cardId;
    private String holderName;
    private int validityPeriod;
    private int bookLimit;
    private StringBuilder brbook = new StringBuilder();

    public LibraryCard(String cardId, String holderName, int validityPeriod, int bookLimit){
        this.cardId = cardId;
        this.holderName = holderName;
        if( validityPeriod >= 1){
            this.validityPeriod = validityPeriod;
        }
        this.bookLimit = bookLimit;
    }
    public String getCardId() {
        return cardId;
    }
    public String getbrBook(){
        return brbook.toString();
    }

    public String getHolderName() {
        return holderName;
    }

    public int getValidityPeriod() {
        return validityPeriod;
    }

    public int getBookLimit() {
        return bookLimit;
    }


    public boolean isValid(int monthsPassed){
        if(monthsPassed >= 1){
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format(
                "CardId: %s | Holder: %s | Validity: %d months | BookLimit: %d",
                getCardId(), getHolderName(), getValidityPeriod(), getBookLimit()
        );
    }


    class Library {
        private Book[] books;
        private LibraryCard[] cards;
        private int bookCount;
        private int cardCount;

        public Library(int maxBooks, int maxCards){
            books = new Book[maxBooks];
            cards = new LibraryCard[maxCards];
        }

        public int getBookCount(){
            return bookCount;
        }

        public int getCardCount(){
            return cardCount;
        }

        // Thêm sách vào thư viện
        public boolean addBook(Book book){
            if(bookCount < books.length){
                books[bookCount++] = book;
                return true;
            }
            return false;
        }

        // Thêm thẻ vào thư viện
        public boolean addLibraryCard(LibraryCard card){
            if(cardCount < cards.length){

                // Kiểm tra trùng tên người sở hữu
                for(int i = 0; i < cardCount; i++){
                    if(cards[i].getHolderName().equalsIgnoreCase(card.getHolderName())){
                        return false; // Đã tồn tại
                    }
                }

                cards[cardCount++] = card;
                return true;
            }
            return false;
        }

        // Hàm mượn sách
        public boolean borrowBook(LibraryCard card, String isbn){

            // 1. kiểm tra giới hạn sách
            if(card.getbrBook().length() >= card.getBookLimit()){
                return false;
            }

            // 2. tìm sách
            for(int i = 0; i < bookCount; i++){
                if(books[i].getBookInfo().contains(isbn)){   // tìm ISBN

                    // thêm sách cho thẻ
                    card.addBorrowedBook(books[i]);

                    // xóa sách khỏi thư viện
                    books[i] = books[bookCount - 1];
                    books[bookCount - 1] = null;
                    bookCount--;

                    return true;
                }
            }
            return false;
        }

        public String getLibraryInfo(){
            return String.format(
                    "Library | BookCount: %d | CardCount: %d",
                    getBookCount(), getCardCount()
            );
        }
        public static void main(String[] args){
            Book b = new Book("978-3-16-148410-0", "Lập trình Java cơ bản", "Nguyễn Văn A", 2020, 300.0);
            System.out.println(b.getBookInfo());
        }
    }







