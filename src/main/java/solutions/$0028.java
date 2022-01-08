package solutions;

import java.util.Scanner;

public class $0028 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x0,x1,y1,y0;
        int[] resx=new int[t],resy=new int[t];
        for (int i = 0; i < t; i++) {
            x0=sc.nextInt();
            y0=sc.nextInt();
            x1=sc.nextInt();
            y1=sc.nextInt();
            resx[i]=x0+(x1-x0)*2;
            resy[i]=y0+(y1-y0)*2;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(resx[i]+" "+resy[i]);
        }
    }
}
