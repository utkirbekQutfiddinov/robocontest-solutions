package solutions;

import java.util.Scanner;

public class $0314 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] res=new int[t];
        int a,b;
        for(int i=0; i<t; i++){
            a=sc.nextInt();
            b=sc.nextInt();
            while(a>=1&&b>=2||a>=2&&b>=1){
                if(a>b){
                    if(b>=a/2){
                        res[i]+=a/2;
                        b-=a/2;
                        a=a%2;
                    } else {
                        res[i]+=b/2;
                        a-=b/2;
                        b=b%2;
                    }
                }else{
                    if(a>=b/2){
                        res[i]+=b/2;
                        a-=b/2;
                        b=b%2;
                    } else {
                        res[i]+=a/2;
                        b-=a/2;
                        a=a%2;
                    }
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
    }
}
