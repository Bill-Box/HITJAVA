package service.impl;

import constant.Constaint;
import model.Book;
import model.Novel;
import model.TextBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IBookServicelmpl implements IBookService {
    public static List<Book> bookk;
    public IBookServicelmpl(){
        bookk = new ArrayList<>();
        Book b1 = new Novel("N001", "The Silent Forest", "Nguyen Nhat Anh", 120000, 10, "Drama");
        Book b2 = new Novel( "N002", "The Lost Kingdom", "J.K. Rowling", 180000, 5, "Fantasy");
        Book b3 = new TextBook("T001", "Basic Java Programming", "James Gosling", 150000, 20, "Computer Science");
        Book b4 = new TextBook("T002", "Physics for High School", "Richard Feynman", 130000, 15, "Physics");
        bookk.add(b1);
        bookk.add(b2);
        bookk.add(b3);
        bookk.add(b4);
    }
    public int count = 4;
    public Scanner sc = new Scanner(System.in);

    @Override
    public void addBook(Book book) {
        bookk.add(book);
        count++;
        System.out.println(Constaint.Book.B_Add);
    }

    @Override
    public Book getBookById(String id) {
        if(count > 0) {
            for(Book b : bookk){
                if(b.getId().equals(id)){
                    System.out.println(Constaint.Book.Search.S_GetBook);
                    return b;
                }
            }
            System.out.println(Constaint.Book.Search.S_UnGetBook);
            return null;
        }
        else {
            System.out.println(Constaint.Book.Search.S_UnGetBook);
            return null;
        }
    }

    @Override
    public void getAllBooksByCrategory(Object category) {

        if (count == 0) {
            System.out.println(Constaint.Book.B_Warring);
            return;
        }

        String type = category.toString(); // Lấy chuỗi user nhập
        int n = 0, t = 0;

        if (type.equalsIgnoreCase("Novel")) {

            for (Book b : bookk) {
                if (b instanceof Novel) {
                    n++;
                }
            }

            if (n == 0) {
                System.out.println(Constaint.Book.Search.S_UnNovel);
            } else {
                System.out.println(Constaint.Book.Search.S_Novel);
                for (Book b : bookk) {
                    if (b instanceof Novel) {
                        System.out.println(b);
                    }
                }
            }
        }

        else if (type.equalsIgnoreCase("TextBook")) {

            for (Book b : bookk) {
                if (b instanceof TextBook) {
                    t++;
                }
            }

            if (t == 0) {
                System.out.println(Constaint.Book.Search.S_UnTextBook);
            } else {
                System.out.println(Constaint.Book.Search.S_TextBook);
                for (Book b : bookk) {
                    if (b instanceof TextBook) {
                        System.out.println(b);
                    }
                }
            }
        }

        else {
            System.out.println("Thể loại không hợp lệ! Hãy nhập: Novel hoặc TextBook");
        }
    }

    @Override
    public void deleteBookBtId(String id) {
        int dem = 0;
        for(int i = 0; i < bookk.size(); i++){
            if(bookk.get(i).getId().equals(id)){
                bookk.get(i);
                dem++;
                count --;
            }
        }
        if(dem > 0)   System.out.println(Constaint.Book.B_Remove);
        else System.out.println(Constaint.Book.B_UnSearch);

    }

    @Override
    public void getAllBooks() {
        if(bookk == null){
            System.out.println(Constaint.Book.Search.S_Book);
        }
        else {
            System.out.println(Constaint.Book.B_Search);
            for(Book b : bookk){
                System.out.println(b);
            }
        }
    }

    @Override
    public void caculateTotalValue() {
        double sum = 0;
        if(count > 0){
            for(Book b : bookk){
                sum += b.getPrice();
            }
            System.out.println("Tatal: " + sum);
        }
        else System.out.println("Total: " + sum);
    }
    public void Menu(){
        System.out.println("--- Menu ---\n" +
                "1. Thêm sách\n" +
                "2. Lấy sách theo ID\n" +
                "3. Lấy tất cả sách theo thể loại (TextBook/Novel)\n" +
                "4. Lấy tất cả sách\n" +
                "5. Xóa sách theo ID\n" +
                "6. Tổng giá trị thư viện \n");
        System.out.print("Chon: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:{
                System.out.println("Nhap the loai Novel - TextBook muon them:");
                String nameb = sc.nextLine();
                if(nameb.equals("Novel")){
                    System.out.println("Nhap thong tin Book Novel muon them:");
                    System.out.print("Id: ");
                    String id = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    Book b = new Novel(id,title,author,price,quantity,genre);
                    addBook(b);
                }
                else if (nameb.equals("TextBook")) {
                    System.out.println("Nhap thong tin Book TextBook muon them:");
                    System.out.print("Id: ");
                    String id = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Subject: ");
                    String subject = sc.nextLine();
                    Book b = new Novel(id,title,author,price,quantity,subject);
                    addBook(b);
                }
                break;
            }
            case 2:{
                System.out.print("Nhap ID Book ban muon lay: ");
                String id = sc.nextLine();
                System.out.println(getBookById(id));
                break;
            }
            case 3:{
                System.out.print("Nhap The Loai Ban Muon Lay:  ");
                Object tl = sc.nextLine();
                getAllBooksByCrategory(tl);
                break;
            }
            case 4:{
                System.out.println("Lay AllBook: ");
                getAllBooks();
                break;
            }
            case 5:{
                System.out.print("Nhap id ban muon xoa ID: ");
                String id = sc.nextLine();
                deleteBookBtId(id);
                break;
            }
            case 6:{
                System.out.println("Tong Gia Thu Vien: ");
                caculateTotalValue();
                break;
            }
            default:
                System.out.println(Constaint.Book.B_Warring);
        }
    }
}
