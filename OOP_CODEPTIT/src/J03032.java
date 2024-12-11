
import java.util.*;
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            String[] tokens=s.split(" ");
            for(String token:tokens){
                for(int i=token.length()-1;i>=0;i--){
                    System.out.print(token.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
