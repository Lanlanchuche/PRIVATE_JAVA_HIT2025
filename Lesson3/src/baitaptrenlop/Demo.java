package baitaptrenlop;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("A", 13.9);
        User user2 = new User( "B", 11.9);
        User user3 = new User("C", 50.7);

        Demo.chuyenTien(user1, user2, 10.0);
        Demo.chuyenTien(user2, user3, 100.0);
    }

    public static void chuyenTien(User user1, User user2, double money) {
        if(user1.getBalance() < money) {
            System.out.println("So du khong du");
        }
        else{
            user1.withdraw(money);
            user2.deposit(money);
            System.out.println("Chuyen tien thanh cong");
            System.out.println("Chuyen tien thanh cong");
        }
    }
}
