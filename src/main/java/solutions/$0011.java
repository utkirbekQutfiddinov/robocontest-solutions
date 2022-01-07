package solutions;

import java.util.Scanner;

public class $0011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte n=sc.nextByte();
        byte[] arr=new byte[n];
        for (byte i = 0; i < n; i++) {
            arr[i]=sc.nextByte();
        }
        arr[maxIndex(arr)]=-1;
        System.out.println(arr[maxIndex(arr)]);
    }
     static int maxIndex(byte[] arr){
        int res=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[res]) res=i;
        }
        return res;
     }
}
