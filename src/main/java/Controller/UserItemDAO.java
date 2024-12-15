
package Controller;

import Controller.Connect;
import Model.UserItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserItemDAO extends Connect{
  private Connection conn;
	    
	    public UserItemDAO(){
	        try {
		conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public boolean addUserItem(UserItem ui){
	        
	        String sql = "INSERT INTO USERITEM(tenTaiKhoan, matKhau) "
	                + "VALUES(?,?)";
	        try {
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, ui.gettenTaikhoan());
	            ps.setString(2, ui.getmatKhau());

	            return ps.executeUpdate() > 0;
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return false;
	    }
	    
	    public ArrayList<UserItem> getListUseritem(){
	        ArrayList<UserItem> list = new ArrayList<>();
	        String sql = "SELECT * FROM USERITEM";
	        
	        try {
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){
	            	UserItem ui = new UserItem();
	                ui.settenTaikhoan(rs.getString("tenTaiKhoan"));
	                ui.setmatKhau(rs.getString("matKhau"));
	               
	                
	                list.add(ui);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return list;
	    }
	    
	    public static void main(String[] args) {
	        new UserItemDAO();
	    }
}
