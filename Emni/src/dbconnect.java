//package StudentMgmtSys;

import java.sql.*;
import javax.swing.*;
public class dbconnect {
	Connection con=null;
	public static Connection java_db(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","123456");
			return con;
		}catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;

		}
	}

}
