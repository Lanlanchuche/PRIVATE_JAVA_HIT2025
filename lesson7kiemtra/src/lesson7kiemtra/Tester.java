/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson7kiemtra;

/**
 *
 * @author Admin
 */
public class Tester extends Employee implements IWorkable {
    private int bugsDetectedCount;

    public Tester() {
    }

    public Tester(int bugsDetectedCount, String id, String name, int age, double basicSalary, Device device) {
        super(id, name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public void work() {
        System.out.println("The tester is working");
    }

    @Override
    public double calculateSalary() {
        return basicSalary + BASE_SALARY_RATE*bugsDetectedCount;
    }
    
    
}
