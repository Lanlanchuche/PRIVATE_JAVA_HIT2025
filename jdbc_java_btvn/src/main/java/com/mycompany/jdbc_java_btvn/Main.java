/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdbc_java_btvn;

import dao.*;
import java.util.List;
import java.util.Scanner;
import model.*;


/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CategoryDAO categoryDAO = new CategoryDAO();
        ProductDAO productDAO = new ProductDAO();
        int choice;
        do{
            System.out.println("======MANAGE PRODUCT=======");
            System.out.println("1. Show category");
            System.out.println("2. Show products of each category");
            System.out.println("3. Insert category");
            System.out.println("4. Delete category");
            System.out.println("5.Insert product");
            System.out.println("0. Thoat");
            System.out.print("NHAP >> ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                    List<Category> list = categoryDAO.findAll();
                    for (Category cat:list){
                        System.out.println(cat.toString());
                    }
                    break;
                case 2:
                    List<ProductDTO> listProduct = productDAO.findAllWithCategoryName();
                    for(ProductDTO p:listProduct){
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    Category cat = new Category();
                    System.out.println("Nhap ten: ");
                    cat.setName(sc.nextLine());
                    categoryDAO.insert(cat);
                    break;
                case 4:
                    System.out.println("Nhap id category muon xoa: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    categoryDAO.delete(id);
                    break;
                case 5:
                    Product product = new Product();
                    System.out.println("Nhap ten: ");
                    product.setName(sc.nextLine());
                    System.out.println("Nhap gia:");
                    product.setPrice(sc.nextDouble());
                    System.out.println("Nhap id phan loai");
                    product.setCategoryId(sc.nextInt());
                    
                    productDAO.insert(product);
                    break;
                
            }
        }
        while(choice!=0);
    }
}
