import model.User;
import service.AuthService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthService au1 = new AuthService();
        System.out.println("--- Menu Auth ---\n" +
                "1. Login\n" +
                "2. Register\n" +
                "3. Exit");
        System.out.print("Chon: ");
        int choice = sc.nextInt();
            switch (choice){
                case 1: {
                    au1.login();
                    break;
                }
                case 2: {
                    au1.register();
                    break;
                }
                case 3:{
                    System.out.println("Exit!");
                    break;
                }
                default: {
                    System.out.println("Loi Thuc Hien!");
                    break;
                }

            }
    }
}