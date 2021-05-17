package baitapchuong5;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
  public   double phuCap;
  public  int soNamDuongChuc;

    public TruongPhong() {

    }
    public TruongPhong(String tenNhanVien,double heSoLuong, double luongCoBan, double LUONG_MAX) {
        super(tenNhanVien,heSoLuong,luongCoBan,LUONG_MAX);

    }

    public double getPhuCap() {
        return phuCap;
    }

    public int getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public void setSoNamDuongChuc(int soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }
    double tinhLuong() {

        return  luongCoBan * heSoLuong + phuCap ;
    }
    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        super.Input();
        System.out.println(" Nhap phu cap");
        phuCap = scanner.nextDouble();
        System.out.println("Nhap so nam duong chuc");
        soNamDuongChuc = scanner.nextInt();
    }
    @Override
    public void Display() {
        super.Display();
        System.out.println(" phu cap" +phuCap);
        System.out.println("so nam duong chuc" + soNamDuongChuc);
    }

}
