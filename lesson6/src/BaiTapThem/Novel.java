/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThem;

/**
 *
 * @author Admin
 */
public class Novel extends Book {
    private String genre;

    public Novel(String genre, String id, String title, String author, double price, int quantity) {
        super(id, title, author, price, quantity);
        this.genre = genre;
    }

    public Novel() {
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-10s %-10s %-10s %-10.2f %-10d %-10s \n", id, title, author, price, quantity, genre);

    }
    public static void printTitle(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Title", "Author", "Price", "Quantity", "Genre");

    }
    
    
}
