import java.util.*;
public class LowerToUpper {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        for (int i=0; i<ip.length(); i++){
            char c = ip.charAt(i);
            if(Character.isLowerCase(c)){
                System.out.print(Character.toUpperCase(c));
            }
            else{
                System.out.print(Character.toLowerCase(c));
            }
        }
    }
}
