package solutions;

import java.util.Scanner;

public class $0003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String longer=sc.next();
        String shorter=sc.next();
        String temp;
        //longer o`zgaruvchiga katta sonni biriktiramiz
        if(longer.length()<shorter.length()){
            temp=longer;
            longer=shorter;
            shorter=temp;
        }
        //kichik sonning uzunligi katta sonning uzunligiga teng bo`lgunicha oldiga "0" qo`shamiz
        int diff=longer.length()-shorter.length();
        for(int i=0; i<diff; i++)
            shorter="0"+shorter;

        int sum=0,rem=0;
        String res="";

        for(int i=(longer.length()-1); i>=0; i--){
            sum=rem+(int)longer.charAt(i)+(int)shorter.charAt(i)-96;
            res=sum%10+res;
            rem=sum/10;
        }

        if(rem>0)
            res="1"+res;
        System.out.println(res);
    }
}
