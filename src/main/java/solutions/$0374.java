package solutions;

import java.util.Scanner;

public class $0374 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minn=Integer.MAX_VALUE,maxx=0,son;
        for (int i = 0; i < 3; i++) {
            son=sc.nextInt();
            if(son>maxx) maxx=son;
            if(son<minn) minn=son;
        }
        System.out.println(maxx-minn);
    }
}
