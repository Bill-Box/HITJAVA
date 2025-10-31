package Runn;

import Usere.User;
import service.AuthService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User usa = new User();
        User[] uss = new User[5];
        Scanner sc = new Scanner(System.in);
        User us_1 = new User("Phong","2025ad", "tranphong12@.gmail.com","035782419" );
        for(int i =0; i < uss.length; i++){
            if(uss[i] == null){
                uss[i] = us_1;
                break;
            }

        }

        System.out.println(uss[0].toString());
        System.out.println("Moi ban chon: ");
        System.out.println("1.Login\n" +"2.Register\n" + "3.Exit");
        System.out.print("Chon: ");
        int a = sc.nextInt();
        switch(a){
            case 1:{
                AuthService a1 = new AuthService();
                a1.login();
                if(a1.checkLogin("Phong", "2025ad")){
                    System.out.println(" Chon: \n" + "1. Get user by id\n "
                    + "2. Get all user \n" + "3. Change password ");
                    int x = sc.nextInt();
                    switch (x){
                        case 1:{
                            System.out.println("Get user by id");
                            a1.getUserById();
                            break;
                        }
                        case 2:{
                            System.out.println("Get all user");
                            a1.toString();
                            break;
                        }
                        case 3: {
                            System.out.println("Change password");
                            a1.changePassword("Trung", "TRung123@", "Trungtrung", "Trungtrung");
                            break;
                        }
                    }
                }
                break;
            }
            case 2:{
                AuthService a2 = new AuthService();
                a2.register("Thanh", "Thanh123@", "Thanh123@gmail.com", "0123456789");
            }
            break;
            case 3:{
                break;
            }
        }

    }
}