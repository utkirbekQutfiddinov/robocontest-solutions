package solutions;

import java.util.Scanner;

public class $0010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        n-=a;
        int b=sc.nextInt();
        n-=b;
        int c=sc.nextInt();
        n-=c;
        if(n<=0) System.out.println("Yes");
        else System.out.println("No");
    }
}