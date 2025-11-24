/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptrenlop.bai1;

/**
 *
 * @author Admin
 */
public class Student {
    
    
    private String name;
    private int age;
    private String lop;

    public Student() {
        name = Constant.NAME;
        age = Constant.AGE;
        lop = Constant.CLASS;
    }

    public Student(String name, int age, String lop) {
        this.name = name;
        this.age = age;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", lop=" + lop + '}';
    }
    
    
    
    
    
    
    
}
