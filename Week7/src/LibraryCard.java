public class LibraryCard {
        private String cardId;
        private String holderName;
        private int validityPeriod;
        private int bookLimit;

        public StringBuilder brbook = new StringBuilder();

        public LibraryCard(String cardId, String holderName, int validityPeriod, int bookLimit){
            this.cardId = cardId;
            this.holderName = holderName;
            this.validityPeriod = validityPeriod >= 1 ? validityPeriod : 1;
            this.bookLimit = bookLimit;
        }

        public String getCardId() {
            return cardId;
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

        public String getbrBook(){
            return brbook.toString();
        }

        public void addBorrowedBook(Book book){
            brbook.append(book.getBookInfo()).append("\n");
        }

        public boolean isValid(int monthsPassed){
            if(monthsPassed >= 1) return true;
            else return false;
        }

        public String toString() {
            return String.format(
                    "CardID: %s | Holder: %s | Validity: %d months | BookLimit: %d",
                    getCardId(), getHolderName(), getValidityPeriod(), getBookLimit()
            );
        }
}
