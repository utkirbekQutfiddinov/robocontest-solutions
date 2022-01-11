package solutions;

import java.util.Scanner;

public class $0073 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();


    }
    public static int fib(int n){
        int[] fib=new int[n+1];
        fib[0]=1;
        fib[1]=1;
        fib[2]=1;
        for (int i = 3; i <= n; i++) {
            fib[i]=(fib[i-2]+fib[i-1])%10;
        }
        return fib[n];
    }
}
