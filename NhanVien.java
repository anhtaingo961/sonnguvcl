package bai3;

public class NhanVien {
private String tenNhanVien;
private double luongCoBan;
private double heSoLuong;
private double LUONG_MAX;
public NhanVien(String tenNhanVien,double heSoLuong) {
	this.tenNhanVien=tenNhanVien;
	this.heSoLuong=heSoLuong;
}
public String gettenNhanVien(){
	return this.tenNhanVien;
}
public void settenNhanVien(String tenNhanVien) {
	this.tenNhanVien=tenNhanVien;
}
public double getluongCoBan(){
	return this.luongCoBan;
}
public void setluongCoBan(double luongCoBan) {
	this.luongCoBan= luongCoBan;
}
public double getheSoLuong() {
	return this.heSoLuong;
}
public void setheSoLuong(double heSoLuong) {
	this.heSoLuong=heSoLuong;
}
public double getLUONG_MAX() {
	return this.LUONG_MAX;
}
public void setLUONG_MAX(double LUONG_MAX) {
	this.LUONG_MAX=LUONG_MAX;
}
public boolean tangLuong(double n) {
	if(luongCoBan*(heSoLuong+n)>LUONG_MAX) {
		return false;
	}
	else {
		heSoLuong +=n;
	return true;
	}

}
public double tinhLuong() {
	 return luongCoBan*heSoLuong <LUONG_MAX? luongCoBan*heSoLuong:LUONG_MAX;
}
public void inTTin() {
    System.out.println();
    System.out.println("Ten nhan vien: " + tenNhanVien);
    System.out.println("Luong: " + tinhLuong());
	System.out.println("djfksdkjffds");
	System.out.println("sjdfkjdsflkjs");
}
}
