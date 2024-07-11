import java.util.*;
public class Count_Words {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int count = 1;
        for(int i=0; i<inp.length(); i++){
            if(inp.charAt(i)==' '){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
