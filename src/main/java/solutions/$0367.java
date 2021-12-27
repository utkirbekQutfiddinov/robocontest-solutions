package solutions;

import java.util.Scanner;

public class $0367 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int res=0;
        for (int i=0; i<n.length(); i++)
            res+=(int)n.charAt(i)-48;
        System.out.println(res);
    }

}
