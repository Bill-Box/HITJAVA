package service;
import model.User;
import java.util.List;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthService {
    private final  UserService au = new UserService();
    private final Scanner sc = new Scanner(System.in);
    public void login(){
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        User uc = chekLogin(username,password);
        if(uc != null) {
            System.out.println(" Dang nhap thanh cong:");
            System.out.println("--- Menu User ---\n" + "1. Get user by id\n" +
                    "2. Get all user\n" +
                    "3. Change password");
            System.out.print("Chon:");
            int choice = sc.nextInt();
               switch (choice) {
                   case 1: {
                       sc.nextLine();
                       System.out.println("Id:");
                       String lid = sc.nextLine();
                       User u = au.getUserById(lid);
                       if (u != null) System.out.println(u);
                       else System.out.println("Khong tim thay!");
                       break;
                   }
                   case 2: {
                       System.out.println("Get all User");
                       au.getAllUsers();
                       break;
                   }
                   case 3: {
                       System.out.println("Change PassWord");
                       changePassword(uc);
                       break;
                   }
                   default: {
                       System.out.println("Khong Hop le!");
                       break;

                   }
               }

            }
        else {
            System.out.println("Dang nhap khong thanh cong!");

        }
    }

    public User chekLogin(String username, String password){
        for(User u: au.getAllUsers()){
            if( u != null && u.getUsername().equalsIgnoreCase(username)
                && u.getPassWord().equals(password)){
                return u;
            }
        }
        return null;
    }
    public void register(){
        System.out.println("Dang Ky:");
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("PassWord: ");
        String password = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("PhoneNumber: ");
        String numberPhone = sc.nextLine();
        au.add(new User(username,password,email,numberPhone));
        System.out.println("Danng Ky Thanh Cong!");
    }
    public void changePassword(User u){
        System.out.print("Nhap MK cu: ");
        String oldPass = sc.nextLine();
        if(u.getPassWord().equals(oldPass)){
            System.out.print("Nhap mk moi: ");
            String newPassWord = sc.nextLine();
            u.setPassWord(newPassWord);
        }
    }


}
