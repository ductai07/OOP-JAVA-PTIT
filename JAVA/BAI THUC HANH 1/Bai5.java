import java.util.Scanner;
import java.util.Stack;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            Stack<String> st = new Stack<>();
            String[] words= s.split(" ");
            for(String v:words){
                st.push(v);
            }
            while(!st.isEmpty()){
                System.out.print(st.pop() + " ");
            }
            System.out.println("\n");
        }
    }
}
