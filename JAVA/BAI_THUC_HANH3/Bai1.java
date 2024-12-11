package BAI_THUC_HANH3;
import java.io.*;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] tokens= line.split("\\s++");
            for(String tok:tokens){
                try {
                    long num = Long.parseLong(tok);
                    if (num > Integer.MAX_VALUE) {
                        sum += num;
                    }
                }
                catch (NumberFormatException e) {

                }
            }
            
        }
        System.out.println(sum);
    }

}
