package baitapchuong5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class TestNhanVien {
    public static void main(String[] args) {
        int choose, n;
        Scanner scan = new Scanner(System.in);
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();

        do {
            displayMenu();

            System.out.println(" Nhập lua chon choose = ");
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    System.out.println(" Nhập so luong cuốn sách của Aptech n = ");
                    n = Integer.parseInt(scan.nextLine());

                    for (int i = 0; i < n; i++) {
                        NhanVien nhanvien = new NhanVien();
                        nhanvien.Input();
                        listNhanVien.add(nhanvien);
                    }
                    break;

                case 2:
                    for (int i = 0; i < listNhanVien.size(); i++) {
                        listNhanVien.get(i).Display();
                    }
                    break;
                default:
                    System.out.println("Chon lai choose = ");
                    break;
            }
        } while ((choose != 3));
    }

    static void displayMenu() {
        System.out.println("1. Nhập thông tin ");
        System.out.println("2. Hiển thị thông tin vừa nhập");

    }
}