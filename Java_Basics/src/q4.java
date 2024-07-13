import java.util.*;
class q4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String o=ro(s);
        System.out.println(o);
    }
    public static String ro(String str){
        int length=str.length();
        if(length>0){
            String re=str.substring(3)+str.substring(0,3);
            return re;
        }
        else{
            return str;
        }
    }
}     