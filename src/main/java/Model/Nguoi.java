
package Model;


public class Nguoi {
    private String maNguoi;
	private String hoVaten;
	private String ngheNghiep;
	private String maHodan;
	private int tuoi;
	private int namSinh;

	// constructor
	public Nguoi() {
	}

	public Nguoi(String maNguoi, String hoVaten, String ngheNghiep, String maHodan, int tuoi, int namSinh) {
		this.maNguoi = maNguoi;
		this.hoVaten = hoVaten;
		this.ngheNghiep = ngheNghiep;
		this.maHodan = maHodan;
		this.tuoi = tuoi;
		this.namSinh = namSinh;
	}

	// getter and setter
	public String getmaNguoi() {
		return this.maNguoi;
	}

	public void setmaNguoi(String maNguoi) {
		this.maNguoi = maNguoi;
	}

	public String gethoVaten() {
		return this.hoVaten;
	}

	public void sethoVaten(String hoVaten) {
		this.hoVaten = hoVaten;
	}

	public String getngheNghiep() {
		return this.ngheNghiep;
	}

	public void setngheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public String getmaHodan() {
		return this.maHodan;
	}

	public void setmaHodan(String maHodan) {
		this.maHodan = maHodan;
	}

	public int gettuoi() {
		return this.tuoi;
	}

	public void settuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getnamSinh() {
		return this.namSinh;
	}

	public void setnamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	// toString
	public String toString() {
		return this.hoVaten + "(Ma Nguoi: " + maNguoi + ", Ma ho dan: " + maHodan + ", Nghe nghiep: " + ngheNghiep
				+ ", Tuoi: " + tuoi + ", Nam sinh: " + namSinh + ")";
	}
}
