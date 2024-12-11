/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.*;
public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int kk=1;kk<=t;kk++){
            int n =sc.nextInt();
         
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int [][] b = new int[m][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            int[][] res=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    res[i][j] = 0;
                    for(int k=0;k<m;k++){
                        res[i][j] *= a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Test " + kk + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
            
 
