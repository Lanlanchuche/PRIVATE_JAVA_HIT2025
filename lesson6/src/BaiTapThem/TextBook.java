/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThem;

/**
 *
 * @author Admin
 */
public class TextBook extends Book {
    private String subject;

    public TextBook() {
    }

    public TextBook(String subject, String id, String title, String author, double price, int quantity) {
        super(id, title, author, price, quantity);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-10s %-10s %-10s %-10.2f %-10d %-10s \n", id, title, author, price, quantity, subject);

    }
    public static void printTitle(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "ID", "Title", "Author", "Price", "Quantity", "Subject");

    }
    
    
}
