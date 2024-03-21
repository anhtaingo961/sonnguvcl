package bai3;

import java.util.Scanner;

public class TestNV {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap ten nhan vien va he so luong");
	NhanVien a=new NhanVien(sc.next(),sc.nextDouble());
	System.out.println("nhap luong max:");
	a.setLUONG_MAX(sc.nextDouble());
	System.out.println("nhap luong co ban");
	a.setluongCoBan(sc.nextDouble());
	System.out.println("nhap he so tang luong va ktra xem co tang khong");
	a.tangLuong(sc.nextDouble());
	double b= a.tinhLuong();
	System.out.println("ten nhan vien "+a.gettenNhanVien());
	System.out.println("luong max"+a.getLUONG_MAX());
	System.out.println(b);
	System.out.println("son ngu vaix ");
}

}
