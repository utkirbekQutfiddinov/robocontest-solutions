package solutions;

import java.util.Scanner;

public class $0415 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int res=0;
        for(int i=1; i<=n; i++){
            if(x%i==0&&x<=n*i) res++;
        }
        System.out.println(res);
    }
}
