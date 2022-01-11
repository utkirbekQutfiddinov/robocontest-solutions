package solutions;

import java.util.Scanner;

public class $0229 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long ar=(a+b)/2;
        long ge= (long) Math.sqrt(a*b);
        if(ar>ge){
            System.out.println(">");
        } else if(ar<ge){
            System.out.println("<");
        } else
            System.out.println("=");
    }
}
