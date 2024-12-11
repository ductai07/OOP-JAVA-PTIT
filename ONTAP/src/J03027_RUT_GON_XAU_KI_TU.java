
/**
 *
 * @author TAI
 */
import java.util.*;
public class J03027_RUT_GON_XAU_KI_TU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)==st.peek()) st.pop();
            else st.push(s.charAt(i));
        }
        String res="";
        if(st.isEmpty()){
            System.out.println("Empty String");
        }
        else {
            while(!st.isEmpty()){
                res+=st.peek();
                st.pop();
            }
        }
        for(int i = res.length()-1;i>=0;i--){
            System.out.print(res.charAt(i));
        }
    
     
    }
}
