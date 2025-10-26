package baitapvenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        // nhap mang
        Main.nhap(arr, n);
        //Menu
        int choice;
        do{
            System.out.println("1. Tinh tong cac phan tu trong mang");
            System.out.println("2. In ra phan tu lon nhat, nho nhat");
            System.out.println("3. Sap xep mang tang dan");
            System.out.println("4. In ra so nguyen to lon nhat trong mang");
            System.out.print("NHAP: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Tong cac phan tu la: " + Main.calSum(arr, n));
                    break;
                case 2:
                    System.out.println("Phan tu lon nhat: " + Main.calMax(arr, n));
                    System.out.println("Phan tu nho nhat: " + Main.calMin(arr, n));
                    break;
                case 3:
                    Main.sortArray(arr, n);
                    System.out.println("Mang sau k sap xep la: ");
                    Main.printArr(arr, n);
                    break;
                case 4:
                    Main.maxPrime(arr, n);
                    break;
            }

        }
        while(choice!=0);
    }
    public static void nhap(int[] arr, int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = " );
            arr[i] = sc.nextInt();
        }

    }
    //in mang
    public static void printArr(int[] arr, int n){
        for(int i = 0; i < n; i++){
            System.out.println("a[" + i + "] = "+ arr[i]);
        }

    }
    public static int calSum(int[] arr, int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int calMax(int[] arr, int n){
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int calMin(int[] arr, int n){
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void sortArray(int[] arr, int n){
        int tmp;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return true;
        }
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void maxPrime(int[] arr, int n){
        boolean flag = false;
        int max = -999999;
        for(int i = 0; i < n; i++){
            if(isPrime(arr[i])){
                flag = true;
                if(arr[i] > max){
                    max = arr[i];
                }

            }
        }
        if(!flag){
            System.out.println("Khong co");
        } else{
            System.out.println("So nguyen to lon nhat trong mang la: " + max);
        }
    }
}
