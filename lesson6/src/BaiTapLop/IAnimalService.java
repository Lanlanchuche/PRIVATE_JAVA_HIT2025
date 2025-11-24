/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BaiTapLop;

import java.util.List;
import BaiTapLop.Animal;

/**
 *
 * @author Admin
 */
public interface IAnimalService {
    public List<Animal> animalsSwimmable(List<Animal> animals);
    
    public List<Animal> animalsFlyable(List<Animal> animals);
    
    public boolean deleteAnimalSwimmable(List<Animal> animals);
    
    public boolean deleteAnimalSwimmableAndFlyable(List<Animal> animals);
}
