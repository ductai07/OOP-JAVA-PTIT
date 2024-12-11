/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double min_ = 111111111;
        double max_ = 0;
        double[] a = new double[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextDouble();
            min_=Math.min(a[i], min_);
            max_=Math.max(a[i],max_);
        }
        double sum=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(a[i]!=max_ && a[i]!=min_){
                sum+=a[i];
                cnt ++;
            }
        }

          System.out.println(String.format("%.2f",sum/cnt));
    }
}
