package service.impl;

import model.Book;

public interface IBookService {
    public  void addBook(Book book);
    public Book getBookById(String id);
    public void getAllBooksByCrategory(Object category);
    public void deleteBookBtId(String id);
    public  void getAllBooks();
    public void caculateTotalValue();

}
