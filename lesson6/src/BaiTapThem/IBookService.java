/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BaiTapThem;

/**
 *
 * @author Admin
 */
public interface IBookService {
    public boolean addBook(Book book);
    
    public void getBookById(String id);
    
    public void getAllBooksByCategory(String category);
    
    public boolean deleteBookById(String id);
    
    public void getAllBooks();
    
    public double calculateTotalValue();
    
}
