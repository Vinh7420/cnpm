
package Model;

public class UserItem {
    private String tenTaiKhoan;
	private String matKhau;
	private String ten;

	public UserItem() {
	}

	public UserItem(String tenTaiKhoan, String matKhau, String ten) {
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.ten = ten;
	}

	public String gettenTaikhoan() {
		return tenTaiKhoan;
	}

	public void settenTaikhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getmatKhau() {
		return matKhau;
	}

	public void setmatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
}
