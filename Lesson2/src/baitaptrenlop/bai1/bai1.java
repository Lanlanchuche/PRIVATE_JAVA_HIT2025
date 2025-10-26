package baitaptrenlop.bai1;

public class bai1 {

    public static int sum(int a[]){
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += a[i];
        }
        return sum;
    }

    public static long times(int a[]){
        long result = 1;
        for(int i = 0; i < 100; i++){
            result *= a[i];
        }
        return result;
    }

    public static boolean isPrime(int n){
        if(n < 2){
            return false;
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
    public static void main(String[] args) {
        int[] a = new int[100];
        for(int i = 0; i < 100; i++){
            a[i] = i;
        }
        System.out.println("Tong cac phan tu la: " + sum(a));
        System.out.println("Tich cac phan tu la: " + times(a));
        System.out.println("Cac phan tu la so nguyen to cua mang la: " );
        for(int x: a){
            if(isPrime(x)){
                System.out.print(x + " ");
            }
        }
    }
}
