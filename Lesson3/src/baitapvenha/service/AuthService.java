package baitapvenha.service;


import baitapvenha.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthService {
    public static List<User> list = new ArrayList<>();
    public static User login(String username, String password){
        for (User user : list){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
    public static void register(String username, String password, String email, String phonenumber){
        if(username.equals("") || password.equals("") || email.equals("") || phonenumber.equals("")){
            System.out.println("Khong duoc de trong thong tin!");
        }
        else {
            User newUser = new User(username, password, email, phonenumber);
            list.add(newUser);
        }
    }


}
