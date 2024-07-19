import java.util.*;
public class Even_Ascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        for (int i=0; i<ip.length(); i++){
            char c = ip.charAt(i);
            int ascii = c;
            if(ascii%2==0){
                System.out.print(c);
            }
        }
    }
}
