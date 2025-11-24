/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThem;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBookServiceImpl sv = new IBookServiceImpl();
        int choice;
        do{
            System.out.println("1. Add book");
            System.out.println("2. Get book by ID");
            System.out.println("3. Get book by category");
            System.out.println("4. Get all books");
            System.out.println("5. Remove book by ID");
            System.out.println("6. Get total value of library");
            System.out.println("0. Exit");
            System.out.print(">>");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                    int choice2;
                    System.out.println("Enter category:");
                    System.out.println("1. Novel");
                    System.out.println("2. Textbook");
                    System.out.print(">>");
                    choice2 = sc.nextInt();
                    sc.nextLine();
                    
                    if (choice2 == 1){
                        
                        Novel b1 = new Novel();
                        System.out.print("Enter ID:");
                        b1.setId(sc.nextLine());
                        System.out.print("Enter title:");
                        b1.setTitle(sc.nextLine());
                        System.out.print("Enter author:");
                        b1.setAuthor(sc.nextLine());
                        System.out.print("Enter price:");
                        b1.setPrice(sc.nextDouble());
                        System.out.print("Enter quantity:");
                        b1.setQuantity(sc.nextInt());
                        sc.nextLine();
                        System.out.print("Enter genre:");
                        b1.setGenre(sc.nextLine());
                        
                        if(sv.addBook(b1)){
                            System.out.println("Add succesfully");
                        }
                        else{
                            System.out.println("Fail");
                        }
                    }
                    else if(choice2 == 2){
                        TextBook b1 = new TextBook();
                        System.out.print("Enter ID:");
                        b1.setId(sc.nextLine());
                        System.out.print("Enter title:");
                        b1.setTitle(sc.nextLine());
                        System.out.print("Enter author:");
                        b1.setAuthor(sc.nextLine());
                        System.out.print("Enter price:");
                        b1.setPrice(sc.nextDouble());
                        System.out.print("Enter quantity:");
                        b1.setQuantity(sc.nextInt());
                        sc.nextLine();
                        System.out.print("Enter genre:");
                        b1.setSubject(sc.nextLine());
                        
                        if(sv.addBook(b1)){
                            System.out.println("Add succesfully");
                        }
                        else{
                            System.out.println("Fail");
                        }
                    }
                    else{
                        System.out.println("Invalid");
                    }
                    
                    break;
                case 2:
                    System.out.print("Enter id to search:");
                    String id = sc.nextLine();
                    sv.getBookById(id);
                    break;
                case 3:
                    System.out.print("Enter category to print:");
                    String category = sc.nextLine();
                    
                    sv.getAllBooksByCategory(category);
                    break;
                case 4:
                    sv.getAllBooks();
                    break;
                case 5:
                    String idToRemove = sc.nextLine();
                    if(sv.deleteBookById(idToRemove)){
                        System.out.println("Delete successfully");
                    }
                    else{
                        System.out.println("Fail");
                    }
                    break;
                case 6:
                    double total = sv.calculateTotalValue();
                    System.out.println("Total value: " + total);
                    break;
            }
        
        }
        while(choice != 0);
        
    }
    
}
