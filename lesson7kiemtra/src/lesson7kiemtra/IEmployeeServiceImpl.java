/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson7kiemtra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class IEmployeeServiceImpl implements IEmployeeService {
    List<Employee> list;

    public IEmployeeServiceImpl(List<Employee> list) {
        this.list = list;
    }

    
    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public Employee getEmployeeById(String id) {
        if(id.isBlank()){
            return null;
        }
        for (Employee e : list){
            if (e.getId().equalsIgnoreCase(id)){
                return e;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> found = new ArrayList<>();
        for (Employee e: list){
            if(e.getName().equalsIgnoreCase(name)){
                found.add(e);
            }
        }
        return found;
    }
    
}
