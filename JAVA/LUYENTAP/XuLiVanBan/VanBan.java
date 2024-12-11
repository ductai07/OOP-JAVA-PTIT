import java.io.*;
import java.util.*;

public class VanBan {
    public static boolean containsDigit(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsPunctuation(String word) {
        String punctuations = ".,!?;:";
        for (char c : word.toCharArray()) {
            if (punctuations.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("VANBAN.in"));
            Set<String> resultSet = new TreeSet<>(); 


            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (containsDigit(word) && !containsPunctuation(word)) {
                        resultSet.add(word);
                    }
                }
            }


            for (String word : resultSet) {
                System.out.println(word);
            }


        } catch (FileNotFoundException e) {
            
        }
    }
}
