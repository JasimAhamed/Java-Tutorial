import java.util.*;
public class Index_Value {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        str=str.toLowerCase();
        String str1="abcdefghijklmnopqresuvwxyz";
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str.length();j++){
                if(str1.charAt(i)==str.charAt(j)){
                    System.out.println(j);
                }
            }

        }
    }
}
