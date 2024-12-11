/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DS_CA_THI;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        ArrayList<CaThi> dsCaThi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ngayThi = sc.nextLine();
            String gioThi = sc.nextLine();
            String phongThi = sc.nextLine();
            dsCaThi.add(new CaThi(i + 1, ngayThi, gioThi, phongThi));
        }
        
        Collections.sort(dsCaThi);
        
        for (CaThi ct : dsCaThi) {
            System.out.println(ct);
        }
        
        sc.close();
    }
}