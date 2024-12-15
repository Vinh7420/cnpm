
package Controller;

import Controller.Connect;
import Model.HoDan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class HoDanDAO extends Connect{
    private Connection conn;
	    
	    public HoDanDAO(){
	        try {
	        conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public boolean addHoDan(HoDan hd){
	        
	        String sql = "INSERT INTO HODAN(maHoDan, soThanhVien, soNha, maKhupho) "
	                + "VALUES(?,?,?,?)";
	        try {
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, hd.getmaHodan());
	            ps.setInt(2, hd.getsoThanhvien());
	            ps.setString(3, hd.getsoNha());
	            ps.setString(4, hd.getmaKhupho());
	            

	            return ps.executeUpdate() > 0;
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return false;
	    }
	    
	    public ArrayList<HoDan> getListHodan(){
	        ArrayList<HoDan> list = new ArrayList<>();
	        String sql = "SELECT * FROM HODAN";
	        
	        try {
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){
	                HoDan hd = new HoDan();
	                hd.setmaHodan(rs.getString("maHodan"));
	                hd.setsoThanhvien(rs.getInt("soHodan"));
	                hd.setsoNha(rs.getString("soNha"));
	                hd.setmaKhupho(rs.getString("maKhupho"));
	               
	                
	                list.add(hd);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return list;
	    }
	    
	    public static void main(String[] args) {
	        new HoDanDAO();
	    }
}
