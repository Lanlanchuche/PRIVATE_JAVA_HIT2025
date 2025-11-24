/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapLop;

/**
 *
 * @author Admin
 */
public class Bird extends Animal{

    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chip chip");
    }

    @Override
    public void eat() {
        System.out.println("The bird is eating");
    }

    @Override
    public void move() {
        System.out.println("The bird is moving");
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean swim() {
        return false;
    }
    
    
}
