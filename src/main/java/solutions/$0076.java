package solutions;

import java.util.Scanner;

public class $0076 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int as=0,s;
        for (int i = 0; i < 7; i++) {
            as+=sc.nextInt();
        }
        s=sc.nextInt();
        if(as>=s)
            System.out.println(0);
        else
            System.out.println(s-as);
    }
}
