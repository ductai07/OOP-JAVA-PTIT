import java.util.Scanner;
import java.util.TreeMap;

public class J03021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); //
        TreeMap<Character, Integer> mp = new TreeMap<>();
        mp.put('a', 2); mp.put('b', 2); mp.put('c', 2);
        mp.put('d', 3); mp.put('e', 3); mp.put('f', 3);
        mp.put('g', 4); mp.put('h', 4); mp.put('i', 4);
        mp.put('j', 5); mp.put('k', 5); mp.put('l', 5);
        mp.put('m', 6); mp.put('n', 6); mp.put('o', 6);
        mp.put('p', 7); mp.put('q', 7); mp.put('r', 7); mp.put('s', 7);
        mp.put('t', 8); mp.put('u', 8); mp.put('v', 8);
        mp.put('w', 9); mp.put('x', 9); mp.put('y', 9); mp.put('z', 9);

        while(t-- > 0){
            String s = sc.nextLine().toLowerCase();
            StringBuilder number = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(mp.containsKey(s.charAt(i))){
                    number.append(mp.get(s.charAt(i)));
                }
            }
            if(isPalindrome(number.toString())){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}