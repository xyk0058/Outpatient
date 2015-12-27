package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.bjtu.sad.dao.RoleDao;
import cn.edu.bjtu.sad.model.Role;
import cn.edu.bjtu.sad.util.DBUtilFactory;


/**
 * RoleDaoImp class description
 * code This Class is implement Role Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see RoleDao
 */
public class RoleDaoImp implements RoleDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	
	/**
	 * delete role element from table by id
	 * if the action is do correct,return true,else return false
	 * @param role_id
	 * @return boolean
	 */
	public boolean deleteRole(String role_id){
		String sql = "delete from role where role_id = ?;";
		
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, role_id);
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
	 * add role element into table
	 * if the action is do correct,return this record role_id,
	 * else return -1
	 * @param role
	 * @return role_id
	 */
	public int addRole(Role role){
		String sql = "INSERT INTO `outpatient`.`role` "
				+ "(`role_power`, `role_describe`) "
				+ "VALUES (?, ?);";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, role.getRole_power());
			ps.setString(2, role.getRole_describe());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int role_id = -1;
		sql = "select max(role_id) as id from role;";
		conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				role_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return role_id;
	}
	
	/**
	 * get all Role element from table
	 * if the action is do correct,return the list of Role,
	 * else return null
	 * @return list
	 */
	public ArrayList<Role> getRole() {
		ArrayList<Role> list = new ArrayList<Role>();
		String sql = "select * from role;";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Role role = new Role();
				// stupid set method......
				role.setRole_describe(rs.getString("role_describe"));
				role.setRole_id(rs.getInt("role_id"));
				role.setRole_power(rs.getInt("role_power"));
				list.add(role);
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
	 * get all role element from table by id
	 * if the action is do correct return the role entity,
	 * else return null
	 * @param role_id
	 * @return role
	 */
	public Role getRole(int role_id) {
		Role role = new Role();
		String sql = "select * from role where role_id = ?;";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, role_id);
			rs = ps.executeQuery();
			if (rs.next()) {
				// stupid set method......
				role.setRole_describe(rs.getString("role_describe"));
				role.setRole_id(rs.getInt("role_id"));
				role.setRole_power(rs.getInt("role_power"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			clearUp(conn);
		}
		return role;
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
