package COLLECTIONS.src;
import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            TreeSet<Integer> st1= new TreeSet<>();
            TreeSet<Integer> st2=new TreeSet<>(Comparator.reverseOrder());
            int[] a= new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    st1.add(a[i]);
                }
                else{
                    st2.add(a[i]);
                }
            }
            for(Integer num:st1){
                System.out.print(num+" ");
            }
            System.out.println();
             
            for (Integer num : st2) {
                System.out.print(num + " ");
            }
            System.out.println(); 
        }
    }
}
