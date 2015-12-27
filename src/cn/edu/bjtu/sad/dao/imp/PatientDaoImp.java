package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.bjtu.sad.dao.PatientDao;
import cn.edu.bjtu.sad.model.Patient;
import cn.edu.bjtu.sad.util.DBUtilFactory;


/**
 * PatientDaoImp class description
 * code This Class is implement Patient Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see PatientDao
 */
public class PatientDaoImp implements PatientDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	
	/**
	 * delete patient element from table by id
	 * if the action is do correct,return true,else return false
	 * @param patient_id
	 * @return boolean
	 */
	public boolean deletePatient(String patient_id){
		String sql = "delete from patient where patient_id = ?;";
		
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, patient_id);
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
	 * add patient element into table
	 * if the action is do correct,return this record patient_id,
	 * else return -1
	 * @param patient
	 * @return patient_id
	 */
	public int addPatient(Patient patient){
		String sql = "INSERT INTO `outpatient`.`patient` "
				+ "(`patient_name`, `patient_sex`, "
				+ "`patient_age`, `idcard_number`, `phone_number`,"
				+ " `hcard_id`, `user_id`) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?);";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, patient.getPatient_name());
			ps.setString(2, patient.getPatient_sex());
			ps.setInt(3, patient.getPatient_age());
			ps.setString(4, patient.getIdcard_number());
			ps.setString(5, patient.getPhone_number());
			ps.setInt(6, patient.getHcard_id());
			ps.setInt(7, patient.getUser_id());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int patient_id = -1;
		sql = "select max(patient_id) as id from patient;";
		conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				patient_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return patient_id;
	}
	
	/**
	 * get all Patient element from table
	 * if the action is do correct,return the list of Patient,
	 * else return null
	 * @return list
	 */
	public ArrayList<Patient> getPatientList () {
		ArrayList<Patient> list = new ArrayList<Patient>();
		String sql = "select * from patient;";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Patient patient = new Patient();
				// stupid set method......
				patient.setHcard_id(rs.getInt("hcard_id"));
				patient.setIdcard_number(rs.getString("idcard_number"));
				patient.setPatient_age(rs.getInt("patient_age"));
				patient.setPatient_id(rs.getInt("patient_id"));
				patient.setPatient_name(rs.getString("patient_name"));
				patient.setPatient_sex(rs.getString("patient_sex"));
				patient.setPhone_number(rs.getString("phone_number"));
				list.add(patient);
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
	 * get all patient element from table by id
	 * if the action is do correct return the patient entity,
	 * else return null
	 * @param patient_id
	 * @return patient
	 */
	public Patient getPatient(int patient_id) {
		Patient patient = new Patient();
		String sql = "select * from patient where patient_id = ?;";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, patient_id);
			rs = ps.executeQuery();
			if (rs.next()) {
				// stupid set method......
				patient.setHcard_id(rs.getInt("hcard_id"));
				patient.setIdcard_number(rs.getString("idcard_number"));
				patient.setPatient_age(rs.getInt("patient_age"));
				patient.setPatient_id(rs.getInt("patient_id"));
				patient.setPatient_name(rs.getString("patient_name"));
				patient.setPatient_sex(rs.getString("patient_sex"));
				patient.setPhone_number(rs.getString("phone_number"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			clearUp(conn);
		}
		return patient;
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
