package com.nt.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.nt.DetailsBean;
import com.nt.db.DBConnection;

public class viewDetailsDAO {

	public ArrayList<DetailsBean> al = new ArrayList<DetailsBean>();
	
	public ArrayList<DetailsBean> retrieve(){
		try {
			Connection co = DBConnection.getCon();
			
			// Accessinng Database Connection
			
			PreparedStatement ps = co.prepareStatement("select * from user_details");
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				DetailsBean b = new DetailsBean();
				
				b.setId(rs.getInt(1));
				b.setuName(rs.getString(2));
				b.setuEmail(rs.getString(3));
				b.setAge(rs.getInt(4));
				b.setuDOB(rs.getDate(5).toString());
				
				al.add(b);
				
			}
			
		}
		catch(Exception e) {e.printStackTrace();}
		
		return al;
	}
	
	
}
