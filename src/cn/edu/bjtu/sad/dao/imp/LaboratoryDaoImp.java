package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.bjtu.sad.dao.LaboratoryDao;
import cn.edu.bjtu.sad.model.Laboratory;
import cn.edu.bjtu.sad.util.DBUtilFactory;


/**
 * LaboratoryDaoImp class description
 * code This Class is implement Laboratory Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see LaboratoryDao
 */
public class LaboratoryDaoImp implements LaboratoryDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	
	/**
	 * delete laboratory element from table by id
	 * if the action is do correct,return true,else return false
	 * @param laboratory_id
	 * @return boolean
	 */
	public boolean deleteLaboratory(String laboratory_id){
		String sql = "delete from laboratory where laboratory_id = ?;";
		
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, laboratory_id);
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
	 * add laboratory element into table
	 * if the action is do correct,return this record laboratory_id,
	 * else return -1
	 * @param laboratory
	 * @return laboratory_id
	 */
	public int addLaboratory(Laboratory laboratory){
		String sql = "INSERT INTO `outpatient`.`laboratory` "
				+ "(`laboratory_name`, `patient_id`, `doctor_id`, `report`, `trade_id`) "
				+ "VALUES (?, ?, ?, ?);";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, laboratory.getLaboratory_name());
			ps.setInt(2, laboratory.getPatient_id());
			ps.setInt(3, laboratory.getDoctor_id());
			ps.setString(4, laboratory.getReport());
			ps.setInt(5, laboratory.getTrade_id());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int laboratory_id = -1;
		sql = "select max(laboratory_id) as id from laboratory;";
		conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				laboratory_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return laboratory_id;
	}
	
	/**
	 * get all Laboratory element from table
	 * if the action is do correct,return the list of Laboratory,
	 * else return null
	 * @return list
	 */
	public ArrayList<Laboratory> getLaboratoryList () {
		ArrayList<Laboratory> list = new ArrayList<Laboratory>();
		String sql = "select * from laboratory;";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Laboratory laboratory = new Laboratory();
				// stupid set method......
				laboratory.setDoctor_id(rs.getInt("doctor_id"));
				laboratory.setLaboratory_id(rs.getInt("laboratory_id"));
				laboratory.setLaboratory_name(rs.getString("laboratory_name"));
				laboratory.setPatient_id(rs.getInt("patient_id"));
				laboratory.setReport(rs.getString("report"));
				laboratory.setTrade_id(rs.getInt("trade_id"));
				list.add(laboratory);
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
	 * get all laboratory element from table by id
	 * if the action is do correct return the laboratory entity,
	 * else return null
	 * @param laboratory_id
	 * @return laboratory
	 */
	public Laboratory getLaboratory(int laboratory_id) {
		
		String sql = "select * from laboratory where laboratory_id = ?;";
		Laboratory laboratory = new Laboratory();
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, laboratory_id);
			rs = ps.executeQuery();
			if(rs.next()) {
				
				// stupid set method......
				laboratory.setDoctor_id(rs.getInt("doctor_id"));
				laboratory.setLaboratory_id(rs.getInt("laboratory_id"));
				laboratory.setLaboratory_name(rs.getString("laboratory_name"));
				laboratory.setPatient_id(rs.getInt("patient_id"));
				laboratory.setReport(rs.getString("report"));
				laboratory.setTrade_id(rs.getInt("trade_id"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			clearUp(conn);
		}
		return laboratory;
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
