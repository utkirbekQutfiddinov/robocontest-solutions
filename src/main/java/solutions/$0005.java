package solutions;

import java.util.Scanner;

public class $0005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        int res=0;

        for(int i=1; i*i<=z; i++ ){
            if(z%i==0&&i<z/i) res++;
        }
        System.out.println(res*2);
    }
}
