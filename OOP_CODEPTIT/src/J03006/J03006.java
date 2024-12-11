package J03006;

import java.util.Scanner;

public class J03006 {
    public static int check(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2!=0){
                return 0;
            }
        }
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return 0;
            l++;r--;
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check(s)==1) System.out.println("YES");
            else System.out.println("NO");

        }

    }
}
