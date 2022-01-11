package solutions;

import java.util.Scanner;

public class $0297 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String word="";
        String num="",prevNum="0",result="";
        for (int i = 0; i < s.length(); i++) {
            if(num.equals("")&&Character.isAlphabetic(s.charAt(i))){
                word+=s.charAt(i);
            } else if(!num.equals("")&&Character.isAlphabetic(s.charAt(i))){
                result+=String.valueOf(Integer.parseInt(num)+Integer.parseInt(prevNum));
                prevNum=String.valueOf(Integer.parseInt(num)+Integer.parseInt(prevNum));
                num="";
                word+=s.charAt(i);
            } else if(word.equals("")&&Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
            } else {
                result+=word;
                word="";
                num+=s.charAt(i);
            }
        }
        if (!word.equals("")){
            result+=word;
            word=null;
        } else if(!num.equals("")){
            result+=String.valueOf(Integer.parseInt(num)+Integer.parseInt(prevNum));

        }
        System.out.println(result);
    }
}
