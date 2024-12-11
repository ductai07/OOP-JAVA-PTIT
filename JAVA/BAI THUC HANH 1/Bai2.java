import java.util.Scanner;
import java.util.Arrays;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String tmp="";
            int tmpp=0;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(Character.isLetter(ch)) tmp+=ch;
                else tmpp+=ch-'0';
            }
            char[] res = tmp.toCharArray();
            Arrays.sort(res);
            String ans = new String(res);
            System.out.println(ans+tmpp);

             

        }
    }
}
