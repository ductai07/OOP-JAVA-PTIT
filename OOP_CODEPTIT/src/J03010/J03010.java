import java.util.Scanner;
import java.util.TreeMap;

public class J03010 {
    public static TreeMap<String, Integer> mp = new TreeMap<>();
    public static String chuanhoa(String s){
        s = s.toLowerCase().trim();
        String[] tokens = s.split("\\s+");
        String res = tokens[tokens.length - 1];
        mp.put(res,mp.getOrDefault(res, 0)+1);
        int cnt=0;
        String kee="";
            if(mp.containsKey(res)){
                int ke=mp.get(res);
                if(ke>1){
                    kee= ke+"";
                }
                
            }
        String tmp="";
        for (int i = 0; i < tokens.length - 1; i++) {
                tmp += tokens[i].charAt(0);
        }
        return res+tmp+kee+"@ptit.edu.vn" ;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(chuanhoa(s));
        }
        sc.close();
    }
}