package Runn;

import Usere.User;
import service.AuthService;

import java.util.Scanner;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        AuthService auth = new AuthService();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- MENU CHÍNH ---");
        System.out.println("1. Đăng ký");
        System.out.println("2. Đăng nhập");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
        int choice = sc.nextInt();
        do{
            switch (choice) {
            case 1:
                auth.register();
                break;
            case 2:
                auth.login();
                break;
            case 0:
                System.out.println("Thoát");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
                }
            }while(choice!= 0);
            

    }
}