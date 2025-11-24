/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptrenlop.bai2;

/**
 *
 * @author Admin
 */
public class Monkey extends Animal{
    private String favouriteFoods;

    public Monkey() {
    }

    public Monkey(String favouriteFoods, String id, String name, int age) {
        super(id, name, age);
        this.favouriteFoods = favouriteFoods;
    }

    @Override
    public void makeSound() {
        //super.makeSound(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Hú hú kẹc kẹc");
    
    }
    
    
}
