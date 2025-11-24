/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaptrenlop.bai1;

import java.util.ArrayList;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        StudentService service = new StudentService(list);
        
        Student s1 = new Student("LAN", 19, "CNTTTA");
        Student s2 = new Student("Hoa", 19, "CNTTTA");
        service.addStudent(s1);
        service.addStudent(s2);
        service.printAll();
        
        
        
        
    }
    
}
