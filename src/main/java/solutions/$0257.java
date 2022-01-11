package solutions;

import java.util.Scanner;

public class $0257 {
    public static void main(String[] args) {
        System.out.println(result(new Scanner(System.in).next()));
    }
    static String result(String s){
        if(s.equals("")) return "YES";
        boolean started1=false,started0=false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') started1=true;
            if(s.charAt(i)=='0'&&started1) started0=true;
            if(s.charAt(i)=='1'&&started0) return "NO";
        }
        return "YES";
    }
}
