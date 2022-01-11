package solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class $0203 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        res=(2*n*n+2*n-1);
        String son=sc.next();
        BigInteger num=new BigInteger(son);
        System.out.println(num.multiply(num).multiply(new BigInteger("2")).add(num.multiply(new BigInteger("2"))).add(new BigInteger("-1")));
    }
}
