package cn.edu.bjtu.sad.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * DBUtilFactory class description
 * This Class is the real Factory of DBUtilFactory.
 * @author sunshine
 */
public class OracleDBUtilFactory extends DBUtilAbstractFactory{

	private Connection conn;
	
	
	/**
	 * getMysqlConn description
	 * This function return Mysql connection.
	 * @author sunshine
	 */
	public Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/outpatient?useUnicode=true&amp;characterEncoding=UTF-8";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}

}
