package baitapchuong5;

import java.util.Scanner;

public class NhanVien {
    public String tenNhanVien;
    public double heSoLuong;
    public double luongCoBan;
    public double LUONG_MAX;

    public NhanVien() {

    }

    ;

    public NhanVien(String tenNhanVien, double heSoluong, double luongCoBan, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoluong;
        this.luongCoBan = luongCoBan;
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }


    public double getLUONG_MAX() {
        return LUONG_MAX;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }


    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }


    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    boolean tangLuong() {
        Scanner scanner = new Scanner(System.in);
        double n;
        double tangLuong;

        System.out.println("Nhap mot tham so truyen vao");
        n = scanner.nextDouble();
        tangLuong = (heSoLuong + n) * luongCoBan;
        if (tangLuong > LUONG_MAX) {
            return false;

        } else {
            return true;

        }


    }
    public void Input() {
        Scanner scanner = new Scanner ( System.in);
        System.out.println("Nhap ten nhan vien: ");
           tenNhanVien = scanner.nextLine();
           System.out.println("Nhap he so luong: ");
          heSoLuong = scanner.nextDouble();
          System.out.println(" Nhap luong co ban ");
          luongCoBan = scanner.nextDouble();
          System.out.println("Nhap luong toi da ");
            LUONG_MAX =scanner.nextDouble();


        }
    public void Display(){
        System.out.println("Ten: " + tenNhanVien);
        System.out.println("He So Luong: " + heSoLuong);
        System.out.println("Luong co ban " + tinhLuong());
        System.out.println("Luong Max " + LUONG_MAX);
        System.out.println("Kiem Tra " + tangLuong());
    }
    @Override
    public String toString() {
      return("Ten: " + tenNhanVien + "He So Luong: " + heSoLuong + "Luong co ban: " +  tinhLuong() + "Luong Max" + LUONG_MAX +"Kiem tra " + tangLuong());
}
    }

