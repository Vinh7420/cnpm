
package Model;

public class HoDan extends Nguoi{
    private String maHodan;
	private String soNha;
	private String maKhupho;
	private int soThanhvien;

	// constructor
	public HoDan() {
	}

	public HoDan(String maHodan, String soNha, String maKhupho, int soThanhvien) {
		this.maHodan = maHodan;
		this.soNha = soNha;
		this.maKhupho = maKhupho;
		this.soThanhvien = soThanhvien;
	}

	// getter and setter
	public String getmaHodan() {
		return this.maHodan;
	}

	public void setmaHodan(String maHodan) {
		this.maHodan = maHodan;
	}

	public String getsoNha() {
		return this.soNha;
	}

	public void setsoNha(String soNha) {
		this.soNha = soNha;
	}

	public String getmaKhupho() {
		return this.maKhupho;
	}

	public void setmaKhupho(String maKhupho) {
		this.maKhupho = maKhupho;
	}

	public int getsoThanhvien() {
		return this.soThanhvien;
	}

	public void setsoThanhvien(int soThanhvien) {
		this.soThanhvien = soThanhvien;
	}

	// toString
	public String toString() {
		return this.maHodan + "(So nha: " + this.soNha + ", Ma khu pho: " + this.maKhupho + ", So thanh vien: "
				+ this.soThanhvien + ")";
	}
}
