package solutions;

import java.util.Scanner;

public class $0006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        String y=String.valueOf(year);
        while(y.length()<4)
            y="0"+y;
        if(year%400==0||(year%4==0&&year%100!=0))
            System.out.println("12/09/"+y);
        else System.out.println("13/09/"+y);
    }
}
