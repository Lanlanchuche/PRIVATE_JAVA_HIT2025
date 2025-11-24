/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapLop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        
        Animal dv1 = new Dog("DOG1", 6);
        Animal dv2 = new Cat("CAT1", 4);
        Animal dv3 = new Bird("Bird1", 2);
        
        animals.add(dv1);
        animals.add(dv2);
        animals.add(dv3);
        animals.add(new Dog("Lan",19));
        
        IAnimalServiceImpl service = new IAnimalServiceImpl();
        
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("-------MENU-------");
            System.out.println("1. Cac con vat co the boi");
            System.out.println("2. Cac con vat co the bay");
            System.out.println("3. Xoa con vat co thể boi");
            System.out.println("4. Xoa con vat vua co the boi vua co the bay");
            System.out.println("0.Thoat");
            System.out.println("CHON:");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    List<Animal> swimmable = service.animalsSwimmable(animals);
                    for (Animal a: swimmable){
                        a.toString();
                    }
                    break;
                case 2:
                    List<Animal> flyable = service.animalsFlyable(animals);
                    for (Animal a: flyable){
                        a.toString();
                    }

                    break;
                case 3:
                    if(service.deleteAnimalSwimmable(animals)){
                        System.out.println("Xoa thanh cong");
                    }
                    else{
                        System.out.println("Xoa that bai");
                    }
                    break;
                case 4:
                    if(service.deleteAnimalSwimmableAndFlyable(animals)){
                        System.out.println("Xoa thanh cong");
                    }
                    else{
                        System.out.println("Hello");
                    }
                    break;
            }
        }
        while(choice != 0);
        
        
    }
    
}
