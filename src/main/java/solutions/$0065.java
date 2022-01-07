package solutions;

import java.util.Scanner;

public class $0065 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bin1=sc.next();
        String bin2=sc.next();
        System.out.println(mult(binToTen(bin1),binToTen(bin2)));
    }
    public static String add(String s1, String s2){
        String temp;
        if(s1.length()>s2.length()){
            temp=s1;
            s1=s2;
            s2=temp;
        }
        int diff=s2.length()-s1.length();
        for (int i=0; i<diff; i++){
            s1="0"+s1;
        }
        int rem=0, sum=0;
        String res="";
        for(int i=(s2.length()-1);i>=0; i--){
            sum=rem+(int)s2.charAt(i)+(int)s1.charAt(i)-96;
            res=sum%10+rem+res;
            rem=sum/10;
        }
        if(rem>0)
            res="1"+res;
        return res;
    }
    public static String multChar(String s2, char c){
        String res="";
        int rem=0, sum=0;
        for(int i=s2.length()-1; i>=0; i--){
            sum=rem+((int)s2.charAt(i)-48)*((int)c-48);
            res=String.valueOf(sum%10)+res;
            rem=sum/10;
        }
        if(rem>0)
            res=String.valueOf(rem)+res;
        return res;
    }
    public static String mult(String s1, String s2){
        String temp;
        if(s1.length()>s2.length()){
            temp=s1;
            s1=s2;
            s2=temp;
        }
        String deg="";
        String res="";
        String word="";
        for(int i=s1.length()-1; i>=0; i--){
            word=multChar(s2,s1.charAt(i));
            word+=deg;
            deg+="0";
            res=add(res,word);
        }
        return res;
    }
    public static String binToTen(String bin){
        String res="0";
        for(int i=0; i<bin.length(); i++){
            res=add(mult(res,"2"),bin.substring(i,i+1));
        }
        return res;
    }
}
