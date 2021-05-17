package baitapchuong5;

import java.util.ArrayList;
import java.util.Scanner;

public class TestNhanVien {
    public static void main(String[] args) {
        int choose, n;
        Scanner scan = new Scanner(System.in);
        ArrayList<TruongPhong> listTruongPhong = new ArrayList<>();

        do {
            displayMenu();

            System.out.println(" Nhập lua chon choose = ");
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    System.out.println(" Nhập so luong nhan vien n = ");
                    n = Integer.parseInt(scan.nextLine());

                    for (int i = 0; i < n; i++) {
                        TruongPhong truongphong = new TruongPhong();
                        truongphong.Input();
                        listTruongPhong.add(truongphong);
                    }
                    break;

                case 2:
                    for (int i = 0; i < listTruongPhong.size(); i++) {
                        listTruongPhong.get(i).Display();
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