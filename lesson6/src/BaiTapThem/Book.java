/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThem;

import BaiTapThem.Borrowable;
import BaiTapThem.ConstantBook;
import BaiTapThem.ErrorConstant;


/**
 *
 * @author Admin
 */
public class Book implements Borrowable {
    
    protected String id;
    protected String title;
    protected String author;
    protected double price;
    protected int quantity;

    public Book() {
        this.id = ConstantBook.ID;
        this.title = ConstantBook.TITLE;
        this.author = ConstantBook.AUTHOR;
        this.price = ConstantBook.PRICE;
        this.quantity = ConstantBook.QUANTITY;
        
    }

    public Book(String id, String title, String author, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void displayInfo(){
        System.out.printf("%-10s %-10s %-10s %-10.2f %-10d\n", id, title, author, price, quantity);
    }
    public static void printTitle(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "ID", "Title", "Author", "Price", "Quantity", "Category");

    }
    @Override
    public boolean borrow(int quantity) {
        if (quantity < 0){
            System.out.println(ErrorConstant.NEGATIVE_VALUE);
            return false;
        }
        else if (quantity <= this.quantity){
            this.quantity -= quantity;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getAvailableQuantity() {
        return this.quantity;
    }
    
    
    
    
}
