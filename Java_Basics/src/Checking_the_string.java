import java.util.*;
public class Checking_the_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine().toLowerCase();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        boolean flag = true;
        if(ip.length()<=26){
            System.out.println("All alphabets are not present");
        }
        else{
            for(int i=0; i<alpha.length(); i++){
                char curr = alpha.charAt(i);
                if(ip.indexOf(curr) == -1){
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("All alphabets are present.");
        }
        else{
            System.out.println("All alphabets are not present.");
        }
    }
}
