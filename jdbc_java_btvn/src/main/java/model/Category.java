/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Category {
    private int id;
    private String name;

    public Category() {
    }

    public Category(String namel) {
        this.name = namel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String namel) {
        this.name = namel;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
    
}
