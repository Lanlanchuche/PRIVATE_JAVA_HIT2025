/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptrenlop.bai2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ZooService {
    private ArrayList<Animal> list;

    public ZooService(ArrayList<Animal> list) {
        this.list = list;
    }
    
    public boolean addAnimal(Animal a){
        if(a.getName().isBlank()){
            return false;
        }
        if(a.getAge() <= 0){
            return false;
        }
        if(a.getId().isBlank()){
            return false;
        }
        list.add(a);
        return true;
    }
    public void showAllAnimal(){
        System.out.printf("%-10s %-10s %-10s %-10s", "ID", "NAME", "AGE", "SOUND");
        for (Animal a:list){
            a.showInfor();
            System.out.printf("%-10s");
            a.makeSound();
            System.out.println("\n");
        }
    }
    
}
