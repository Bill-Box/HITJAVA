package service;

import Usere.User;

import java.util.List;
import java.util.Scanner;

public class AuthService extends User {
    public AuthService() {
    }

    public AuthService(String username, String password, String email, String phoneNumber) {
        super(username,password, email, phoneNumber);
        this.getUsername() ;
    }

    public static Scanner sc = new Scanner(System.in);
    public User[] usrs = new User[5];

    public void login(){
        System.out.print("Username: ");
          String username = sc.nextLine();

        System.out.print("Password: ");
         String password = sc.nextLine();
        if (checkLogin(username,password)){
            System.out.println("Dang nhap Thanh Cong!");
        }
        else System.out.println(" Dang Nhap KHong Thanh Cong Or" +
                " Tai Khoan Khong Ton Tai!");

    }
    public boolean checkLogin(String username, String password) {
        for (User u : usrs) {
            if (u != null &&
                    u.getUsername().equalsIgnoreCase(username) &&
                    u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    public  void register(String username, String password, String email, String phoneNumber){
        boolean ktr = false;
        System.out.print("Username: ");
         username = sc.nextLine();

        System.out.print("Password: ");
         password = sc.nextLine();

        System.out.print("Email: ");
         email = sc.nextLine();

        System.out.print("PhoneNumber: ");
         phoneNumber = sc.nextLine();
        for(int i =0; i< usrs.length; i++) {
            if (usrs[i] == null) {
                usrs[i] = new User(username, password, email, phoneNumber);
                System.out.println("Đăng ký thành công!");
                ktr = true;
                break;
            }
        }

    }
    public int index = 0;
    public  void changePassword(String username,String password, String Newpassword, String confirmNewPassWord){
        System.out.print("Username: ");
        username = sc.nextLine();

        System.out.print("Password: ");
        password = sc.nextLine();
        //checkLogin
        int index = 0;
        for(int i = 0; i < usrs.length; i++){
            if(username.equals(usrs[i])) index = i;
        }
        System.out.print("NewPassWord: ");
        Newpassword = sc.nextLine();
        System.out.print("ConfirmNewPassWord: ");
        confirmNewPassWord = sc.nextLine();
        if(Newpassword.equals(confirmNewPassWord)) {
            usrs[index].setPassword(Newpassword);
        }
    }
    public String getAllUser(){
        return super.toString();

    }
    public String getUserById( ){
        return "UserID: " + usrs[index].getId();
    }

}
