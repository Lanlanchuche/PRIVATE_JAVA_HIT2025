/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lesson7kiemtra;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IEmployeeService {
    
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(String id);
    public List<Employee> getEmployeeByName(String name);
    
}
