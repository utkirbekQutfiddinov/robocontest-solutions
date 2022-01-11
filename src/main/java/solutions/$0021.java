package solutions;

import java.util.Scanner;

public class $0021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int res=0;
        for (int i = 0; i < 3; i++) {
            res+=(sc.nextInt()+1)/2;
        }
        System.out.println(res);
    }
}
