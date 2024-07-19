import java.util.*;
public class Count {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String temp=str;
        temp=temp.toLowerCase();
        int Uppercount=0;
        int Lowercount=0;
        int Digitcount=0;
        int Vowelscount=0;
        int Specialcount=0;
        for(int i=0;i<str.length();i++){
            if(temp.charAt(i)=='a'||temp.charAt(i)=='e'||temp.charAt(i)=='i'||temp.charAt(i)=='o'||temp.charAt(i)=='u'){
                Vowelscount++;
            }
            if(Character.isLowerCase(str.charAt(i))){
                Lowercount++;
            }
            else if(Character.isUpperCase(str.charAt(i))){
                Uppercount++;
            }
            else if(Character.isDigit(str.charAt(i))){
                Digitcount++;
            }
            else if(Character.isWhitespace(str.charAt(i))){
                continue;
            }
            else{
                Specialcount++;
            }
        }
        System.out.println("Lower Case= "+Lowercount);
        System.out.println("Upper Case= "+Uppercount);
        System.out.println("Digit= "+Digitcount);
        System.out.println("Vowels = "+Vowelscount);
        System.out.println("Special Caracter= "+Specialcount);
    }
}
