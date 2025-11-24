/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThem;

import java.lang.classfile.Signature;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class IBookServiceImpl implements IBookService{
    private List<Book> list = new ArrayList<>();

    
     
    @Override
    public boolean addBook(Book book) {
        if (book.getId().isEmpty()){
            System.err.println(ErrorConstant.EMPTY_ID);
            return false;
        }
        if(book.getPrice() < 0 || book.getQuantity() < 0){
            System.err.println(ErrorConstant.NEGATIVE_VALUE);
        }
        for (Book b: list){
            if(b.getId().equals(book.getId())){
                System.out.println(ErrorConstant.DUPLICATE_ID);
                return false;
            }
        }
        list.add(book);
        return true;
    }
    
    @Override
    public void getBookById(String id) {
        boolean flag = false;
        if(id.isEmpty()){
            System.out.println(ErrorConstant.EMPTY_ID);
        }
        else{
            Book.printTitle();
            for (Book b : list){
                if (b.getId().equals(id)){
                    b.displayInfo();
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("Not Found");
        }
    }

    @Override
    public void getAllBooksByCategory(String category) {
        if (category.isBlank()){
            System.err.println(ErrorConstant.EMPTY_INPUT);
        }
        if(category.equalsIgnoreCase("Novel")){
            Novel.printTitle();
        }
        else if (category.equalsIgnoreCase("Textbook")){
            TextBook.printTitle();
        }
        for (Book b : list) {
            if (b instanceof Novel && category.equalsIgnoreCase("Novel")){
                b.displayInfo();
            }
            if (b instanceof TextBook && category.equalsIgnoreCase("Textbook")){
                b.displayInfo();
            }
        
        }
    }

    @Override
    public boolean deleteBookById(String id) {
        if (id.isBlank()){
            System.err.println(ErrorConstant.EMPTY_ID);
            return false;
        }
        else {
            boolean flag = false;
            for (Book b : list){
                if(b.getId().equals(id)){
                    flag = true;
                    list.remove(b);
                    return true;
                }
            }
            return flag;
        }
    }

    @Override
    public void getAllBooks() {
        if (list.isEmpty()){
            System.err.println(ErrorConstant.EMPTY_LIST);
            return;
        }
        Book.printTitle();
        for (Book b : list){
            b.displayInfo();
        }
    }

    @Override
    public double calculateTotalValue() {
        if (list.isEmpty()){
            System.err.println(ErrorConstant.EMPTY_LIST);
            return 0;
        }
        //in tieu de o main
        double total = 0;
        for (Book b : list){
            total += b.getAvailableQuantity();
        }
        return total;
    }

    
    
}
