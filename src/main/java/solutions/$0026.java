package solutions;

import java.util.Scanner;

public class $0026 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte t=sc.nextByte();
        long[] n=new long[t];
        for(byte i=0; i<t; i++){
            n[i]=sc.nextLong();
            n[i]=n[i]%1000000007;
            n[i]=n[i]*n[i];
            n[i]=n[i]%1000000007;
        }
        for (byte i = 0; i < t; i++) {
            System.out.println(n[i]);
        }
    }
}
