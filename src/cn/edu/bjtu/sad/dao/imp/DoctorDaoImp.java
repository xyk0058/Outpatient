package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.bjtu.sad.dao.DoctorDao;
import cn.edu.bjtu.sad.model.Doctor;
import cn.edu.bjtu.sad.util.DBUtilFactory;

/**
 * DoctorDaoImp class description
 * code This Class is implement Doctor Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see DoctorDao
 */
public class DoctorDaoImp implements DoctorDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	/**
	 * delete doctor element from table by id
	 * if the action is do correct,return true,else return false
	 * @param doctor_id
	 * @return boolean
	 */
	public boolean deleteDoctor(String doctor_id){
		String sql = "delete from doctor where doctor_id = ?;";
		
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, doctor_id);
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
	 * add doctor element into table
	 * if the action is do correct,return this record doctor_id,
	 * else return -1
	 * @param doctor
	 * @return doctor_id
	 */
	public int addDoctor(Doctor doctor){
		String sql = "INSERT INTO `outpatient`.`doctor` "
				+ "(`doctor_name`, `doctor_sex`, "
				+ "`doctor_level`, `doctor_score`, `department_id`, `role_id`) "
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, doctor.getDoctor_name());
			ps.setString(2, doctor.getDoctor_sex());
			ps.setString(3, doctor.getDoctor_level());
			ps.setInt(4, doctor.getDoctor_score());
			ps.setInt(5, doctor.getDepartment_id());
			ps.setInt(6, doctor.getRole_id());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int doctor_id = -1;
		sql = "select max(doctor_id) as id from doctor;";
		conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				doctor_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return doctor_id;
	}
	
	
	/**
	 * update doctor table element
	 * if the action is do correct,return true,
	 * else return false
	 * @param doctor
	 * @return boolean
	 */
	public boolean updateDoctor(Doctor doctor){
		String sql = "UPDATE `outpatient`.`doctor` SET "
				+ "`doctor_name`= ?, `doctor_sex`= ?, "
				+ "`doctor_level`= ?, `doctor_score`= ?, `department_id`= ?, "
				+ "`role_id`= ? WHERE (`doctor_id`= ?);";
		
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, doctor.getDoctor_name());
			ps.setString(2, doctor.getDoctor_sex());
			ps.setString(3, doctor.getDoctor_level());
			ps.setInt(4, doctor.getDoctor_score());
			ps.setInt(5, doctor.getDepartment_id());
			ps.setInt(6, doctor.getRole_id());
			ps.setInt(7, doctor.getDoctor_id());
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
	 * get all Doctor element from table
	 * if the action is do correct,return the list of Doctor,
	 * else return null
	 * @return doctorList
	 */
	public ArrayList<Doctor> getDoctorList() {
		
		ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
		String sql = "select * from doctor";
		
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Doctor doctor = new Doctor();
				
				// stupid set method......
				doctor.setDepartment_id(rs.getInt("department_id"));
				doctor.setDoctor_id(rs.getInt("doctor_id"));
				doctor.setDoctor_level(rs.getString("doctor_level"));
				doctor.setDoctor_name(rs.getString("doctor_name"));
				doctor.setDoctor_score(rs.getInt("doctor_score"));
				doctor.setDoctor_sex(rs.getString("doctor_sex"));
				doctor.setRole_id(rs.getInt("role_id"));
				
				doctorList.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			clearUp(conn);
		}
		return doctorList;
	}
	
	/**
	 * get all Doctor element from table where department_id is same
	 * if the action is do correct,return the list of Doctor,
	 * else return null
	 * @return doctorList
	 */
	public ArrayList<Doctor> getDoctorListByDepartment(int department_id) {
		
		ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
		String sql = "select * from doctor where department_id = ?";
		
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Doctor doctor = new Doctor();
				
				// stupid set method......
				doctor.setDepartment_id(rs.getInt("department_id"));
				doctor.setDoctor_id(rs.getInt("doctor_id"));
				doctor.setDoctor_level(rs.getString("doctor_level"));
				doctor.setDoctor_name(rs.getString("doctor_name"));
				doctor.setDoctor_score(rs.getInt("doctor_score"));
				doctor.setDoctor_sex(rs.getString("doctor_sex"));
				doctor.setRole_id(rs.getInt("role_id"));
				
				doctorList.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			clearUp(conn);
		}
		return doctorList;
	}
	
	/**
	 * get all doctor element from table by id
	 * if the action is do correct return the doctor entity,
	 * else return null
	 * @param doctor_id
	 * @return doctor
	 */
	public Doctor getDoctor(int doctor_id) {
		
		String sql = "select * from doctor where doctor_id = ?;";
		Doctor doctor = new Doctor();
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, doctor_id);
			rs = ps.executeQuery();
			if(rs.next()) {
				
				// stupid set method......
				doctor.setDepartment_id(rs.getInt("department_id"));
				doctor.setDoctor_id(rs.getInt("doctor_id"));
				doctor.setDoctor_level(rs.getString("doctor_level"));
				doctor.setDoctor_name(rs.getString("doctor_name"));
				doctor.setDoctor_score(rs.getInt("doctor_score"));
				doctor.setDoctor_sex(rs.getString("doctor_sex"));
				doctor.setRole_id(rs.getInt("role_id"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			clearUp(conn);
		}
		return doctor;
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
