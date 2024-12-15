/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Fees;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class FeesDAO extends Connect{
        private Connection conn;
	    
	    public FeesDAO(){
	        try {
	        conn = DriverManager.getConnection(Connect.DB_URL, Connect.USER_NAME, Connect.PASSWORD);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public boolean addFees(Fees f){
	        
	        String sql = "INSERT INTO FEES(feeId, name, description, amount, type) "
	                + "VALUES(?,?,?,?)";
	        try {
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, f.getfeesId());
	            ps.setString(2, f.getname());
	            ps.setString(3, f.getdescription());
	            ps.setDouble(4, f.getamount());
                    ps.setString(3, f.gettype());
	            

	            return ps.executeUpdate() > 0;
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return false;
	    }
	    
	    public ArrayList<Fees> getLisFees(){
	        ArrayList<Fees> list = new ArrayList<>();
	        String sql = "SELECT * FROM FEES";
	        
	        try {
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){
	                Fees f = new Fees();
	                f.setfeesId(rs.getString("feeId"));
	                f.setname(rs.getString("name"));
	                f.setdescription(rs.getString("description"));
	                f.setamount(rs.getDouble("amount"));
	                f.settype(rs.getString("type"));
	                
	                list.add(f);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        return list;
	    }
	    
	    public static void main(String[] args) {
	        new FeesDAO();
	    }
}
