package solutions;

import java.util.Scanner;

public class $0202 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        if(n==0) System.out.println(6);
        else{
            while(n>0){
                switch(n%10){
                    case 1: {
                        res+=2;
                        break;
                    }
                    case 3:
                    case 2:
                    case 5:{
                        res+=5;
                        break;
                    }
                    case 8:
                    {
                        res+=7;
                        break;
                    }
                    case 4: {
                        res+=4;
                        break;
                    }
                    case 7: {
                        res+=3;
                        break;
                    }
                    case 6:
                    case 0:
                    default:{
                        res+=6;
                        break;
                    }
                }
                n=n/10;
            }
            System.out.println(res);

        }
        }
}
