package solutions;

import java.util.Scanner;

public class $0119 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0&&n%4==0){
            System.out.println(n/2);
        } else {
            System.out.println(-1);
        }
    }
}