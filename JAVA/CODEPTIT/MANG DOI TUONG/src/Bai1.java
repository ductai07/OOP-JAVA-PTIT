/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lít = new ArrayList<>();
        int m = 0;
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] tokens = s.split("\\s+");
            for(String tmp:tokens){
                     lít.add(tmp);
                }
                
        }
         
        Collections.sort(lít, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });
        
         
        for (String word : lít) {
            System.out.println(word+" - "+word.length());
            break;
        }
    }
    
        
            
                
}
 