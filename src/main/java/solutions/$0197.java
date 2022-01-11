package solutions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class $0197 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<BigInteger> primeList=new ArrayList<>();
        primeList.add(new BigInteger("2"));
        BigInteger son=new BigInteger("2");
        int i=1;
        boolean add=true;
        while(i<n){
            son=son.add(new BigInteger("1"));
            for (int j = 0; j < primeList.size(); j++) {
                if (son.mod(primeList.get(j)).equals(new BigInteger("0"))){
                    add=false;
                    break;
                }
            }
            if(add) {
                primeList.add(son);
                i++;
            }
            else add=true;

        }
        System.out.println(primeList.get(n-1));
    }
}
