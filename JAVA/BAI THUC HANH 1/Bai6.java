import java.util.Scanner;

public class Bai6 {
    public static String chuanHoa(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");
        StringBuilder res  = new StringBuilder();
        for (String word : words) {
            res.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    public static String cach1(String[] words) {
        StringBuilder res  = new StringBuilder();
        res.append(words[words.length - 1]).append(" ");
        for (int i = 0; i < words.length - 1; i++) {
            res.append(words[i]).append(" ");
        }
        return res.toString().trim();
    }

    public static String cach2(String[] words) {
        StringBuilder res  = new StringBuilder();
        for (int i = 1; i < words.length; i++) {
            res.append(words[i]).append(" ");
        }
        res.append(words[0]);
        return res.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  
        
        while (t-- > 0) {
            int luachon = sc.nextInt();
            sc.nextLine();  
            String name = sc.nextLine();
            name = chuanHoa(name);
            String[] words = name.split(" ");
            
            if (luachon == 1) {
                System.out.println(cach1(words));
            } else if (luachon == 2) {
                System.out.println(cach2(words));
            }
        }
        
        sc.close();
    }
}