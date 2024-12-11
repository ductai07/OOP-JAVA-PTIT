import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/Users/ASUS/Desktop/OOP/OOP_CODEPTIT/src/DATA.in"));
        while(sc.hasNextLine()){
            String ten=sc.nextLine().trim().toLowerCase();
            if(ten.equals("END")) break;
            String[] tokens=ten.split("\\s+");
            String res="";
            for(String token:tokens){
                res+=Character.toUpperCase(token.charAt(0))+token.substring(1)+" ";
            }
            System.out.println(res.trim());
        }

    }
}
