package solutions;

import java.util.Scanner;

public class $0259 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt()+26;
        String s=sc.next();
        String res="";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                if(((int)s.charAt(i)+k)>90){
                    k-=26;
                    res+=(char)((int)s.charAt(i)+k);
                }
            }
//            res+=s.charAt(i);
        }
        System.out.println(res);
    }
}
//if(Character.isAlphabetic(s.charAt(i))){
//        if (s.charAt(i)){
//        res+=(char)(((int)s.charAt(i)+k)%90+64);
//        } else {
//        res+=(char)(((int)s.charAt(i)+k)%122+96);
//        }
//        } else
