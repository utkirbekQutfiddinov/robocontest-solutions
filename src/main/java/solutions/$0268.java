package solutions;

import java.util.Scanner;

public class $0268 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bir=sc.nextInt();
        int ikki=sc.nextInt();
        int sich=sc.nextInt();
        if(Math.abs(sich-bir)>Math.abs(sich-ikki))
            System.out.println("2-mushuk");
        else if(Math.abs(sich-bir)<Math.abs(sich-ikki))
            System.out.println("1-mushuk");
        else
            System.out.println("sichqon");
    }
}
