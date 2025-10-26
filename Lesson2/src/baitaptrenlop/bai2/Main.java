package baitaptrenlop.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mang.printList();
        System.out.println();
        Main.printArrReverse();
    }
    public static void printArrReverse(){
        for(int i = Mang.arr.length-1;i>=0;i--){
            System.out.print(Mang.arr[i]);
        }
    }
}
