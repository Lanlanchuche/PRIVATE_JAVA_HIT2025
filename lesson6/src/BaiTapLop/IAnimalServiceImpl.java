/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapLop;

import java.util.ArrayList;
import java.util.List;
import BaiTapLop.Animal;
import BaiTapLop.IAnimalService;

/**
 *
 * @author Admin
 */
public class IAnimalServiceImpl implements IAnimalService{

    public IAnimalServiceImpl() {
    }

    
    @Override
    public List<Animal> animalsSwimmable(List<Animal> animals) {
        List<Animal> swimmable = new ArrayList<>();
        for(Animal a: animals){
            if (a.swim()){
                swimmable.add(a);
            }
        }
        return swimmable;
    }

    @Override
    public List<Animal> animalsFlyable(List<Animal> animals) {
        List<Animal> flyable = new ArrayList<>();
        for(Animal a: animals){
            if (a.fly()){
                flyable.add(a);
            }
        }
        return flyable;
    }

    @Override
    public boolean deleteAnimalSwimmable(List<Animal> animals) {
        for (Animal a: animals){
            if(a.swim()){
                animals.remove(a);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAnimalSwimmableAndFlyable(List<Animal> animals) {
        for (Animal a: animals){
            if(a.swim() && a.fly()){
                animals.remove(a);
                return true;
            }
        }
        return false;
    }
    
}
