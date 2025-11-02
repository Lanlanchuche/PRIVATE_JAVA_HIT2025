package baitapvenha.Menu;

import baitapvenha.model.User;
import baitapvenha.service.AuthService;
import baitapvenha.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int choice1;
        do{
            System.out.println("-----------MENU AUTH---------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.println(">>");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.println("Nhap ten nguoi dung: ");
                    String username = sc.nextLine();
                    System.out.println("Nhap mat khau");
                    String password = sc.nextLine();
                    User u = AuthService.login(username,password);
                    if(u!=null) {
                        System.out.println("Dang nhap thanh cong");
                        do {
                            System.out.println("=========Menu User=======");
                            System.out.println("1. Get user by id");
                            System.out.println("2. Get all users");
                            System.out.println("3. Change password");
                            System.out.println("0. Exit");
                            System.out.println("Enter: ");
                            choice1 = sc.nextInt();
                            sc.nextLine();

                            switch (choice1) {
                                case 1:
                                    UserService.getUserById();
                                    break;
                                case 2:
                                    UserService.getAllUsers();
                                    break;
                                case 3:
                                    System.out.println("Enter new password: ");
                                    String newpassword = sc.nextLine();
                                    System.out.println("Confirm new password: ");
                                    System.out.println("1.Confirm");
                                    System.out.println("0.Not confirm");
                                    String choice2 = sc.nextLine();
                                    UserService.changePassword(u, newpassword, choice2);
                                    break;
                            }
                        } while (choice1 != 0);
                    }
                    else{
                        System.out.println("Dang nhap khong thanh cong");
                    }


                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Nhap ten nguoi dung: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap mat khau: ");
                    String pass = sc.nextLine();
                    System.out.println("Nhap email: ");
                    String email = sc.nextLine();
                    System.out.println("Nhap so dien thoai: ");
                    String so = sc.nextLine();
                    AuthService.register(name,pass,email,so);
                    break;
            }
        }
        while (choice != 3);
    }
}
