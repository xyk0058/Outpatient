package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.bjtu.sad.dao.UserDao;
import cn.edu.bjtu.sad.model.User;
import cn.edu.bjtu.sad.util.DBUtilFactory;


/**
 * UserDaoImp class description
 * This Class is implement User Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see UserDao
 */
public class UserDaoImp implements UserDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	
	/**
	 * delete user element from table by id
	 * if the action is do correct,return true,else return false
	 * @param user_id
	 * @return boolean
	 */
	public boolean deleteUser(String user_id){
		String sql = "delete from user where user_id = ?;";
		
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			clearUp(conn);
		}
		
		return true;
	}
	
	/**
	 * add user element into table
	 * if the action is do correct,return this record user_id,
	 * else return -1
	 * @param user
	 * @return user_id
	 */
	public int addUser(User user){
		String sql = "INSERT INTO `outpatient`.`user` "
				+ "(`user_name`, `password`, `role_id`, `phone_number`) "
				+ "VALUES (?, ?, ?, ?);";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUser_name());
			ps.setString(2, user.getPassword());
			ps.setInt(3, user.getRole_id());
			ps.setString(4, user.getPhone_number());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int user_id = -1;
		sql = "select max(user_id) as id from user;";
		conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				user_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return user_id;
	}
	
	
	/**
	 * get all User element from table
	 * if the action is do correct,return the list of User,
	 * else return null
	 * @return list
	 */
	public ArrayList<User> getUser() {
		ArrayList<User> list = new ArrayList<User>();
		String sql = "select * from user;";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				User user = new User();
				// stupid set method......
				user.setPassword(rs.getString("password"));
				user.setPhone_number(rs.getString("phone_number"));
				user.setRole_id(rs.getInt("role_id"));
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_name(rs.getString("user_name"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			clearUp(conn);
		}
		return list;
	}


	/**
	 * get all User element from table by id
	 * if the action is do correct return the User entity,
	 * else return null
	 * @param user_id
	 * @return user
	 */
	public User getUser(int user_id) {
		User user = new User();
		String sql = "select * from user where user_id = ?;";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, user_id);
			rs = ps.executeQuery();
			if (rs.next()) {
				// stupid set method......
				user.setPassword(rs.getString("password"));
				user.setPhone_number(rs.getString("phone_number"));
				user.setRole_id(rs.getInt("role_id"));
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_name(rs.getString("user_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			clearUp(conn);
		}
		return user;
	}
	
	private void clearUp(Connection conn) {
        try {
            if(rs != null){
                rs.close();
            }
            if(ps != null){
                ps.close();
            }
            if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
