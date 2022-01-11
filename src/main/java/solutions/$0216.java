package solutions;

import java.util.Scanner;

public class $0216 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        res+=n/10*2;
        if(n%10>=7)
            res+=2;
        else if(n%10>=3)
            res++;
        System.out.println(res);
    }
}
