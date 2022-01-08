package solutions;

import java.util.Scanner;

public class $0044 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yil=sc.nextInt();
        if(yil%400==0||yil%4==0&&yil%100!=0)
            System.out.println("Kabisa yili");
        else System.out.println("Kabisa yili emas");
    }
}
