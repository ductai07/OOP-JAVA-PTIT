import java.util.*;
import java.io.*;

public class J07022_LOAI_BO_SO_NGUYEN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> words = new ArrayList<>();

        while (sc.hasNext()) {
            String token = sc.next();
            try {
                int num = Integer.parseInt(token);  
            } catch (NumberFormatException e) {
                 words.add(token);
            }
        }
 
        Collections.sort(words);

         
        System.out.println(String.join(" ", words));
    }
}
