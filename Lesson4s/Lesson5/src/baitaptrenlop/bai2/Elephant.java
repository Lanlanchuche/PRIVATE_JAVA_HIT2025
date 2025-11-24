/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptrenlop.bai2;

/**
 *
 * @author Admin
 */
public class Elephant extends Animal{
    private double trunkLength;

    public Elephant() {
    }

    public Elephant(double trunkLength, String id, String name, int age) {
        super(id, name, age);
        this.trunkLength = trunkLength;
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound() {
        //super.makeSound(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Ù ò ò");
    }
    
    
}
