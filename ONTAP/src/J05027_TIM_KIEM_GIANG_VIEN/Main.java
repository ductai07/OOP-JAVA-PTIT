 
package J05027_TIM_KIEM_GIANG_VIEN;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> gv_list = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String hoten = sc.nextLine();
            String bomon = sc.nextLine();
            GiangVien a = new GiangVien(hoten, bomon);
            gv_list.add(a);
        }
        int q =sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String tmp = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+tmp+":");
            tmp=tmp.toLowerCase();
            
            for(int i=0;i<gv_list.size();i++){
                String ten = gv_list.get(i).getHoTen().toLowerCase();
                if(ten.contains(tmp)){
                    System.out.println(gv_list.get(i));
                }
            }
        }
        
    }
    
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN