public class Library {
        private Book[] books;
        private LibraryCard[] cards;
        private int bookCount;
        private int cardCount;

        public Library(int maxBooks, int maxCards){
            books = new Book[maxBooks];
            cards = new LibraryCard[maxCards];
            bookCount = 0;
            cardCount = 0;
        }
        public Library(Book[] books, LibraryCard[] cards, int bookCount,int cardCount){
            this.books = books;
            this.cards = cards;
            this.bookCount = bookCount;
            this.cardCount = cardCount;
        }

        public int getBookCount(){
            return bookCount;
        }

        public int getCardCount(){
            return cardCount;
        }

        public boolean addBook(Book book){
            if(bookCount < books.length){
                books[bookCount++] = book;
                return true;
            }
            return false;
        }

        public boolean addLibraryCard(LibraryCard card){
            if(cardCount < cards.length){
                for(int i = 0; i < cardCount; i++){
                    if(cards[i].getCardId().equalsIgnoreCase(card.getCardId())){
                        return false;   // trùng tên
                    }
                }
                cards[cardCount++] = card;
                return true;
            }
            return false;
        }

        public boolean borrowBook(LibraryCard card, String isbn){
            // check limit
            if(card.getbrBook().length() >= card.getBookLimit()){
                return false;
            }
            // find book
            for(int i = 0; i < bookCount; i++){
                if(books[i].getIsbn().equalsIgnoreCase(isbn)){

                    // add book to card
                    card.addBorrowedBook(books[i]);

                    // remove book from library
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
                    "Library: Books=%d | Cards=%d",
                    getBookCount(), getCardCount()
            );
        }


}
