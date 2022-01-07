package solutions;

import java.util.Scanner;

public class $0012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                res++;
        }
        if(res%2==0)
            System.out.println("Bobur");
        else System.out.println("Ali");
    }
    static boolean isPrime(int n){
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
