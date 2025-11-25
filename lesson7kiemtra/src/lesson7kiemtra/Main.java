/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson7kiemtra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int choice;
        List<Employee> list =  new ArrayList<>();
        Device device1 = new Device("Device1", "model1");
        Developer dev1 = new Developer(15, "001", "DEV1", 35, 4000000, device1);
        list.add(dev1);
        Developer dev2 = new Developer(35, "003", "DEV2", 35, 4000000, device1);
        list.add(dev2);
        Tester tester1 = new Tester(50, "002", "TESTER1", 40, 4000000, device1);
        list.add(tester1);
        Tester tester2 = new Tester(36, "004", "TESTER2", 26, 4000000, device1);
        list.add(tester2);
        Tester tester3 = new Tester(36, "005", "TESTER3", 28, 4000000, device1);
        list.add(tester3);
        IEmployeeServiceImpl service = new IEmployeeServiceImpl(list);
        
        
        do{
            System.out.println("1. In ra danh sach tat ca nhan vien");
            System.out.println("2. In ra thong tin nhan vien theo ID");
            System.out.println("3. Loc ra danh sach nhan vien theo ten");
            System.out.println("0. Thoat");
            System.out.println("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                    list = service.getAllEmployees();
                    if(list.isEmpty()){
                        System.out.println("Danh sach rong");
                    }
                    else{
                        for (Employee e:list){
                            System.out.println(e.toString());
                        }
                    }
                    
                    break;
                case 2:
                    System.out.println("Nhap id muon tim:");
                    String id = sc.nextLine();
                    Employee emp = service.getEmployeeById(id);
                    if (emp == null){
                        System.out.println("Khong tim thay");
                    }
                    else{
                        System.out.println(emp.toString());
                    }
                    
                    break;
                case 3:
                    System.out.println("Nhap ten muon tim: ");
                    String name = sc.nextLine();
                    List<Employee> listname = service.getEmployeeByName(name);
                    if(listname.isEmpty()){
                        System.out.println("Danh sach rong");
                    }
                    else{
                        for (Employee e:listname){
                            System.out.println(e.toString());
                        }
                    }
                    
                    break;
              
            }
        }
        while(choice!=0);
    }
    
}
