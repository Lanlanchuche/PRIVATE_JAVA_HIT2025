/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptrenlop.bai2;

/**
 *
 * @author Admin
 */
public class Animal {
    protected String id;
    protected String name;
    protected int age;

    public Animal() {
    }

    public Animal(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void showInfor(){
        System.out.printf("%-10s %-10s %-10d", id, name, age);
    }
    public void makeSound(){
        
    }
}
