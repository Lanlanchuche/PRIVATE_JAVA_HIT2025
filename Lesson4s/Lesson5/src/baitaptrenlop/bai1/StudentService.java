/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptrenlop.bai1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentService {
    private ArrayList<Student> list;
    //ArrayList<Student> dsHocSinh = new ArrayList<>();

    public StudentService(ArrayList<Student> list) {
        this.list = list;
    }
    
    public boolean addStudent(Student s){
        if(s.getName().isEmpty()){
            return false;
        }
        if(s.getAge() <= 0){
            return false;
        }
        if(s.getLop().isEmpty()){
            return false;
        }
        list.add(s);
        return true;
    }
    public boolean removeStudent(String name){
        boolean flag = false;
        for(Student s: list){
            if(s.getName().equalsIgnoreCase(name))
                list.remove(s);
                flag = true;
        }
        return flag;
    }
    public void changeInforStudent(String name){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for (Student s:list){
            if(s.getName().equalsIgnoreCase(name)){
                System.out.println("Nhap ten moi: ");
                String ten = sc.nextLine();
                if(ten.isEmpty()){
                    System.out.println("Ten khong duoc de trong");
                    return;
                }
                System.out.println("Nhap tuoi moi");
                int tuoi = sc.nextInt();
                if (tuoi <= 0){
                    System.out.println("Tuoi khong duoc <= 0");
                    return;
                }
                sc.nextLine();
                System.out.println("Nhap lop moi:");
                String lop = sc.nextLine();
                if(lop.isEmpty()){
                    System.out.println("Lop khong duoc de trong");
                    return;
                }
                s.setName(ten);
                s.setAge(tuoi);
                s.setLop(lop);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
        else{
            System.out.println("Successfully changed");
        }
    }
    public void searchName(String name){
        boolean flag = false;
        for (Student s: list){
            if(s.getName().equalsIgnoreCase(name))
            {
                System.out.println(s.toString());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
    }
    public void searchClass(String lop){
        boolean flag = false;
        for(Student s: list){
            if(s.getLop().equalsIgnoreCase(lop)){
                System.out.println(s.toString());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
    }
    public void printAll(){
        for (Student s: list){
            System.out.println(s.toString());
        }
    }
    
}
