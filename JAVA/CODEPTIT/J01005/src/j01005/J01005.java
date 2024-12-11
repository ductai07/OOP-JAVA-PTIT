
package j01005;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author TAI
 */

public class J01005 {

    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long kq=0;
 
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int x =Integer.parseInt(s);
                kq+=x;
            } catch(NumberFormatException e){
                
            }
  
        }
        System.out.println(kq);
         
        
    }
    
}
