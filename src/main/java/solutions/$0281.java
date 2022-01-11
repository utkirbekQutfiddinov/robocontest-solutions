package solutions;

import java.util.Scanner;

public class $0281 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte n=sc.nextByte();
        byte[] count=new byte[101];
        for (byte i = 0; i <n ; i++) {
            count[sc.nextByte()]++;
        }
byte maxElemIndex=0;
        for (byte i=0; i<=100; i++){
            if(count[i]>count[maxElemIndex]) maxElemIndex=i;
        }
        System.out.println(n-count[maxElemIndex]);
    }
}
