import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> binaryList = (ArrayList<String>) ois.readObject();

        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> vanBanSet = new LinkedHashSet<>();
         
        while (sc.hasNextLine()) {
            String tokens=sc.nextLine();
            String[] words = tokens.toLowerCase().split("\\s+");
            for(String tok:words){
                vanBanSet.add(tok);
            }
        }

        Set<String> binarySet = new HashSet<>();
        for (String str : binaryList) {
            String[] words = str.toLowerCase().split("\\s+");
            binarySet.addAll(Arrays.asList(words));
        }

        for (String word : vanBanSet) {
            if (binarySet.contains(word)) {
                System.out.println(word);
            }
        }
    }
}