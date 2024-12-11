package J03005;

import java.util.Scanner;

public class Main {
    public static String chuanhoa(String s){
        String[] tokens = s.split("\\s+");
        int idx=0;
        while(tokens[idx].isEmpty()){
            idx++;
        }
        String lastname = tokens[idx].toUpperCase();
        String firstname ="";
        for(int i=idx+1;i< tokens.length;i++){
            if(!tokens[i].isEmpty()){
                firstname+=Character.toUpperCase(tokens[i].charAt(0));
                for(int j=1;j<tokens[i].length();j++){
                    firstname+=Character.toLowerCase(tokens[i].charAt(j));
                }
                firstname+=" ";
            }
        }
        return firstname.trim()+", "+lastname;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(chuanhoa(s));

        }
    }



}
