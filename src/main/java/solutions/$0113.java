package solutions;

import java.util.Scanner;

public class $0113 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte baho=sc.nextByte();
        if(baho%5>=3&&baho>=38){
            baho= (byte) (baho/5*5+5);
        }
        System.out.println(baho);
    }
}
