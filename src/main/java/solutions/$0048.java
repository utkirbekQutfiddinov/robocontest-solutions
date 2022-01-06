package solutions;

import java.util.Scanner;

public class $0048 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte n=sc.nextByte();
        int[][] a=new int[n][];
        int num=1;
        for(int i=1; i<=n; i++){
            a[i-1]=new int[i];
            for(int j=0; j<i; j++){
                a[i-1][j]=num++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
