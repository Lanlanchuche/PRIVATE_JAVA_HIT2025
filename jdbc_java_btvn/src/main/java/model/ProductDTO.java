/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Product;

/**
 *
 * @author Admin
 */
public class ProductDTO extends Product{
    private String categoryName;

    public ProductDTO() {
        super();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "categoryName=" + categoryName + '}';
    }

    
    
}
