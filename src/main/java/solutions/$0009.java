package solutions;

import java.util.Scanner;

public class $0009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte n=sc.nextByte();
        byte res=0;
        for (byte i=0; i<n; i++){
            res= (byte) (res^sc.nextByte());
        }
        System.out.println(res);
    }
}
