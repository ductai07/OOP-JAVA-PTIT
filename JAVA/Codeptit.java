import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Codeptit {
    
    public static void main(String[] args) {
         String s ="      vO le         hOA bINh";
         String[] tokens=s.split("\\s+");
         for(String token:tokens){
            System.out.println(token);
         }
    }
}