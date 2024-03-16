package com.nt.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.nt.DetailsBean;
import com.nt.db.DBConnection;


public class addDetailsDAO {

	public int k=0;
	public int insert(DetailsBean b) {
		
		try {
				Connection con = DBConnection.getCon();
				PreparedStatement ps = con.prepareStatement("insert into user_details VALUES(user_id.nextval,?, ?, ?, TO_DATE(?, 'MM-DD-YYYY'))");
				ps.setString(1, b.getuName());
				ps.setString(2, b.getuEmail());
				ps.setInt(3, b.getAge());
				ps.setString(4,b.getuDOB());
				k =ps.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return k;
		
	}
	
	
}
