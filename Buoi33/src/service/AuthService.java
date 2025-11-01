package service;

import Usere.User;

import java.util.List;
import java.util.Scanner;

public class AuthService {
    private final UserService usrs = new UserService();
    public final Scanner sc = new Scanner(System.in);

    public void login(){
        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        User loggedUser = checkLogin(username, password);
        if (loggedUser != null) {
            System.out.println("Đăng nhập thành công!");
            showMenu(loggedUser);
        } else {
            System.out.println("Sai tài khoản hoặc mật khẩu!");
        }

    }

    public User checkLogin(String username, String password) {
        for (User u : usrs.getAllUsers()) {
            if (u != null &&
                    u.getUsername().equalsIgnoreCase(username) &&
                    u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
    public  void register(){
        boolean ktr = false;
        System.out.print("Username: ");
         String username = sc.nextLine();

        System.out.print("Password: ");
         String password = sc.nextLine();

        System.out.print("Email: ");
         String email = sc.nextLine();

        System.out.print("PhoneNumber: ");
         String phoneNumber = sc.nextLine();
        usrs.addUser(new User(username, password, email, phoneNumber));
        System.out.println("Đăng ký thành công!");

    }
    public void changePassword(User user) {
        System.out.print("Nhập mật khẩu cũ: ");
        String oldPass = sc.nextLine();

        if (!oldPass.equals(user.getPassword())) {
            System.out.println("Sai mật khẩu cũ!");
            return;
        }

        System.out.print("Nhập mật khẩu mới: ");
        String newPass = sc.nextLine();
        user.setPassword(newPass);
        System.out.println("Đổi mật khẩu thành công!");
    }
    private void showMenu(User loggedUser) {
        int choice;
        do {
            System.out.println("\n--- Menu User ---");
            System.out.println("1. Get user by id");
            System.out.println("2. Get all user");
            System.out.println("3. Change password");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập id người dùng: ");
                    String id = sc.nextLine();
                    User u = usrs.getUserById(id);
                    if (u != null) System.out.println(u);
                    else System.out.println("Không tìm thấy user!");
                    break;

                case 2:
                    usrs.getAllUsers();
                    break;

                case 3:
                    changePassword(loggedUser);
                    break;

                case 0:
                    System.out.println("Đã thoát menu.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
    public String getAllUser(){
        return super.toString();

    }


}
