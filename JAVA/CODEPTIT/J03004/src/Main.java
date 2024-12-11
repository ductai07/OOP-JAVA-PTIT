import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String chuanhoa(String s){
        String res="";
        String[] tokens = s.split("\\s+");
        for (String token :  tokens){
            if(!token.isEmpty()){
                res+= Character.toUpperCase(token.charAt(0));
                for(int i=1;i<token.length();i++){
                    res+= Character.toLowerCase(token.charAt(i));
                }
                res+=" ";
            }
        }
        return res.trim();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(chuanhoa(s));

        }
    }
}