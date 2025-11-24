/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapLop;

/**
 *
 * @author Admin
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void move() {
        System.out.println("The dog is moving");
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean swim() {
        return true;
    }
    
}
