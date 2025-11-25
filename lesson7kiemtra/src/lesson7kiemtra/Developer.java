/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson7kiemtra;

/**
 *
 * @author Admin
 */
public class Developer extends Employee implements IDebuggable, IWorkable {
    private int overtimeHours;

    public Developer() {
    }

    public Developer(int overtimeHours, String id, String name, int age, int basicSalary, Device device) {
        super(id, name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public void fixBug() {
        System.out.println("The developer is fixing bugs");
    }

    @Override
    public void work() {
        System.out.println("The developer is working");
    }

    @Override
    public double calculateSalary() {
        return basicSalary + BASE_SALARY_RATE*overtimeHours;
    }
    
    
}
