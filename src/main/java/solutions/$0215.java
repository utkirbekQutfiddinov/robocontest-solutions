package solutions;

import java.util.Scanner;

public class $0215 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a= (long) (Math.pow(2,2*n+1)-Math.pow(2,n+1)+1);
        if(a%5==0)
            System.out.println("A");
        else System.out.println("B");
    }
}
