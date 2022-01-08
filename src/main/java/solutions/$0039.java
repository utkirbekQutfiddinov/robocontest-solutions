package solutions;

import java.util.Scanner;

public class $0039 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tel=sc.nextInt();
        int uy1=tel-(tel%100)/2;
        int uy2=tel-(tel%100+100)/2;
        System.out.println(uy2+" "+uy1);
    }
}
