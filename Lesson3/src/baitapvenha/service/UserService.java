package baitapvenha.service;


import baitapvenha.model.User;

public class UserService {
    public static void getUserById(){
        for (User u: AuthService.list){
            System.out.println(u.getId());
        }
    }
    public static void getAllUsers(){
        for  (User u: AuthService.list){
            System.out.println(u);
        }
    }
    public static void changePassword(User user, String newPassword, String confirmNewPassword ){
        if(confirmNewPassword.equals(newPassword)){
            user.setPassword(newPassword);
            System.out.println("Thay doi mat khau thanh cong");
        }


    }
}
