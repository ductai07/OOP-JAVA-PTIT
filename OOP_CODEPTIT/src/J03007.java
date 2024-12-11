import java.util.Scanner;

public class J03007 {
    public static int check(String s){
        int sum=0;
        if(s.charAt(s.length()-1)!='8') return 0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-'0');
        }
        if(sum%10==0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)==1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
