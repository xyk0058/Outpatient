package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.bjtu.sad.dao.HcardDao;
import cn.edu.bjtu.sad.model.Hcard;
import cn.edu.bjtu.sad.util.DBUtilFactory;

/**
 * HcardDaoImp class description
 * code This Class is implement Hcard Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see HcardDao
 */

public class HcardDaoImp implements HcardDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	/**
	 * delete Hcard element from table by id
	 * if the action is do correct,return true,else return false
	 * @param hcard_id
	 * @return boolean
	 */
	public boolean deleteHcard(String hcard_id){
		String sql = "delete from hcard where hcard_id = ?;";
		
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, hcard_id);
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
	 * add hcard element into table
	 * if the action is do correct,return this record hcard_id,
	 * else return -1
	 * @param hcard
	 * @return hcard_id
	 */
	public int addHcard(Hcard hcard){
		String sql = "INSERT INTO `outpatient`.`hcard` "
				+ "(`idcard_number`, `phone_number`, `crash_card`)"
				+ " VALUES (?, ?, ?);";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, hcard.getIdcard_number());
			ps.setString(2, hcard.getPhone_number());
			ps.setString(3, hcard.getCrash_card());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int hcard_id = -1;
		sql = "select max(hcard_id) as id from hcard;";
		conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				hcard_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return hcard_id;
	}
	
	/**
	 * get all hcard element from table by id
	 * if the action is do correct return the hcard entity,
	 * else return null
	 * @param hcard_id
	 * @return hcard
	 */
	public Hcard getHcard(int hcard_id) {
		
		String sql = "select * from hcard where hcard_id = ?;";
		Hcard hcard = new Hcard();
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, hcard_id);
			rs = ps.executeQuery();
			if(rs.next()) {
				
				// stupid set method......
				hcard.setCrash_card(rs.getString("crash_card"));
				hcard.setHcard_id(rs.getInt("hcard_id"));
				hcard.setIdcard_number(rs.getString("idcard_number"));
				hcard.setPhone_number(rs.getString("phone_number"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			clearUp(conn);
		}
		return hcard;
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
