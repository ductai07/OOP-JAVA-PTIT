package COLLECTIONS.src;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Stack<String> st=new Stack<>();
            String s=sc.nextLine();
            String[] tokens=s.split(" ");
            for(String token:tokens){
                st.push(token);
            }

            while(!st.isEmpty()){
                System.out.print(st.peek()+" ");
                st.pop();
            }
            System.out.println();
         }
    }
}
