package solutions;

import java.util.Scanner;

public class $0302 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] count=new int[123];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<='z'&&s.charAt(i)>='a'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
                count[(int)s.charAt(i)]++;
        }
        for (int i = 97; i <123 ; i++) {
            System.out.print((char)i);
            System.out.print(' ');
            System.out.print(count[i]);
            System.out.println();
        }
        for (int i = 65; i < 91; i++) {
            System.out.print((char)i);
            System.out.print(' ');
            System.out.print(count[i]);
            System.out.println();
        }
    }
}
