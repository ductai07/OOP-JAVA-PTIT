package J07045_LOAI_PHONG;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String kh,ten;
    private int dongia;
    private double phidv;

    public LoaiPhong(String line) {
        String[] phong = line.split("\\s+");
        this.kh=phong[0];
        this.ten=phong[1];
        this.dongia=Integer.parseInt(phong[2]);
        this.phidv=Double.parseDouble(phong[3]);
    }
    public String getTen(){
        return ten;
    }
    @Override
    public int compareTo(LoaiPhong o){
        return this.ten.compareTo(o.getTen());
    }
    @Override
    public String toString(){
        return kh+" "+ten+" "+dongia+" "+phidv;
    }

}
