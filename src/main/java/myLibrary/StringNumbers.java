package myLibrary;

public class StringNumbers {
    public static int comp(String s1,String s2){
        boolean s1g=false, s2g=false;
        if(s2.length()>s1.length()){
            s2g=true;
        } else if(s1.length()>s2.length()){
            s1g=true;
        } else {
            for (int i=0; i<s1.length(); i++){
                if(s1.charAt(i)>s2.charAt(i)){
                    s1g=true;
                    break;
                } else if(s2.charAt(i)>s1.charAt(i)){
                    s2g=true;
                    break;
                }
            }
        }
        if(s1g) return 1;
        else if(s2g) return -1;
        else return 0;
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
            res=String.valueOf(sum%10+rem)+res;
            rem=sum/10;
        }
        if(rem>0)
            res="1"+res;
        return res;
    }
    public static String sub(String s1, String s2){
        String temp;
        boolean negative=false;
        if(comp(s1,s2)==1){
            temp=s1;
            s1=s2;
            s2=temp;
        } else if(comp(s1,s2)==0)
            return "0";
        //so, s2 is greter than s1
        else negative=true;
        int diff=s2.length()-s1.length();
        for(int i=0; i<diff; i++)
            s1="0"+s1;
        String res="";
        int g=0, l=0;
        boolean credited=false;

        for (int i=s2.length()-1; i>=0; i--){
            g=(int)s2.charAt(i)-48;
            l=(int)s1.charAt(i)-48;
            if(credited){
                credited=false;
                g--;
            }
            if(g<l) {
                g += 10;
                credited = true;
            }
            res=String.valueOf(g-l)+res;
        }
        //clearing front zeros
        while(res.startsWith("0")){
            res=res.substring(1);
        }
        //putting - if s1 is less than s2
        if(negative) res="-"+res;
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
    public static String div(String s2, String s1){
        if(comp(s2,s1)==-1)
            return "0";
        else if(comp(s2,s1)==0)
            return "1";
        String res="0";
        while(comp(s2,s1)==1){
            res=add(res,"1");
            s2=sub(s2,s1);
        }
        if (comp(s2,s1)==0)
            res=add(res,"1");
        return res;
    }
    public static String mod(String s2, String s1){
        if(comp(s2,s1)==-1)
            return s2;
        else if(comp(s2,s1)==0)
            return "0";
        else return sub(s2,mult(s1,div(s2,s1)));
    }
    public static String pow(String s, String deg){
        String res="1";
        while(deg.equals("0")==false){
            res=mult(res,s);
            deg=sub(deg,"1");
        }
        return res;
    }
    public static String binToTen(String bin){
        String deg="0";
        String res="0";
        for(int i=bin.length()-1; i>=0; i--){
            res=add(res,multChar(pow("2",deg),bin.charAt(i)));
            deg=add(deg,"1");
        }
        return res;
    }
}