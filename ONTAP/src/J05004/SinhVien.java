
package J05004;
 
public class SinhVien {
    private String maSV,hoTen,lop,birth;
    private double gpa;
    private static int cnt=0;

    public SinhVien(String hoTen, String lop, String birth, double gpa) {
        cnt++;
        this.maSV= String.format("B20DCCN%03d",cnt );
        this.hoTen = hoTen;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }
    private String chuanhoabirth(){
        StringBuilder res = new StringBuilder(birth);
        if(res.charAt(1)=='/') res.insert(0, '0');
        if(res.charAt(4)=='/') res.insert(3,'0');
        return res.toString();
        
    }
    private String chuanhoaHoten(){
        String tmp = "";
        hoTen=hoTen.trim();
        String[] tokens = hoTen.toLowerCase().split("\\s+");
        for (String tok:tokens){
            tmp += Character.toUpperCase(tok.charAt(0)) + tok.substring(1)+" ";   
        }
        return tmp.trim();
    }
    @Override
    public String toString(){
        String birh=chuanhoabirth();
        String hoten=chuanhoaHoten();
        return maSV+" "+hoten+" "+lop+" "+birh+" "+String.format("%.2f",gpa);
    }
    
    
}
