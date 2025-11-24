/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BaiTapThem;

/**
 *
 * @author Admin
 */
public interface Borrowable {
    
    public boolean borrow(int quantity);

    public int getAvailableQuantity();
    
}
