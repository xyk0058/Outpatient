/**
 * 
 */
package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.bjtu.sad.dao.PrescriptionDao;
import cn.edu.bjtu.sad.model.Prescription;
import cn.edu.bjtu.sad.util.DBUtilFactory;

/**
 * PrescriptionDaoImp class description
 * code This Class is implement Prescription Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see PrescriptionDao
 */
public class PrescriptionDaoImp implements PrescriptionDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	
	/**
	 * delete prescription element from table by id
	 * if the action is do correct,return true,else return false
	 * @param prescription_id
	 * @return boolean
	 */
	public boolean deletePrescription(String prescription_id){
		String sql = "delete from prescription where prescription_id = ?;";
		
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, prescription_id);
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
	 * add prescription element into table
	 * if the action is do correct,return this record prescription_id,
	 * else return -1
	 * @param prescription
	 * @return prescription_id
	 */
	public int addPrescription(Prescription prescription){
		String sql = "INSERT INTO `outpatient`.`prescription` "
				+ "(`patient_id`, `doctor_id`, "
				+ "`medicine_list`, `evaluate_score`, `trade_id`) "
				+ "VALUES (?, ?, ?, ?);";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, prescription.getPatient_id());
			ps.setInt(2, prescription.getDoctor_id());
			ps.setString(3, prescription.getMedicine_list());
			ps.setInt(4, prescription.getEvaluate_score());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int prescription_id = -1;
		sql = "select max(prescription_id) as id from prescription;";
		conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				prescription_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return prescription_id;
	}
	
	
	/**
	 * get all Prescription element from table
	 * if the action is do correct,return the list of Prescription,
	 * else return null
	 * @return list
	 */
	public ArrayList<Prescription> getPrescription () {
		ArrayList<Prescription> list = new ArrayList<Prescription>();
		String sql = "select * from prescription;";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Prescription prescription = new Prescription();
				// stupid set method......
				prescription.setDoctor_id(rs.getInt("doctor_id"));
				prescription.setEvaluate_score(rs.getInt("evaluate_score"));
				prescription.setMedicine_list(rs.getString("medicine_list"));
				prescription.setPatient_id(rs.getInt("patient_id"));
				prescription.setPrescription_id(rs.getInt("prescription_id"));
				prescription.setTrade_id(rs.getInt("trade_id"));
				list.add(prescription);
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
	 * get all prescription element from table by id
	 * if the action is do correct return the prescription entity,
	 * else return null
	 * @param prescription_id
	 * @return prescription
	 */
	public Prescription getPatient(int prescription_id) {
		Prescription prescription = new Prescription();
		String sql = "select * from prescription;";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, prescription_id);
			rs = ps.executeQuery();
			if (rs.next()) {
				// stupid set method......
				prescription.setDoctor_id(rs.getInt("doctor_id"));
				prescription.setEvaluate_score(rs.getInt("evaluate_score"));
				prescription.setMedicine_list(rs.getString("medicine_list"));
				prescription.setPatient_id(rs.getInt("patient_id"));
				prescription.setPrescription_id(rs.getInt("prescription_id"));
				prescription.setTrade_id(rs.getInt("trade_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			clearUp(conn);
		}
		return prescription;
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
