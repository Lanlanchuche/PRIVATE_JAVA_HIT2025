package baitaptrenlop;

import java.util.UUID;

public class User {

    private String id;
    private String name;
    private double balance;

    public User(String username, String password, String email, String phonenumber) {
    }



    public User(String name, double balance) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0){
            this.balance += amount;
        }
        else{
            System.out.println("So tien nap vao phai > 0");
            return;
        }
    }
    public void withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
        }

    }
}
