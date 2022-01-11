package solutions;

import java.util.Scanner;

public class $0112 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int q=sc.nextInt();
        int[] res=new int[q];
        int qi;
        for (int i = 0; i <q; i++) {
            qi=sc.nextInt();
            for (int j = 0; j < n; j++) {
                arr[j]+=qi;
                res[i]+=Math.abs(arr[j]);
            }
        }
        for (int i = 0; i < q; i++) {
            System.out.println(res[i]);
        }
    }
}
