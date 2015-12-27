package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.bjtu.sad.dao.RegisterRecordDao;
import cn.edu.bjtu.sad.model.RegisterRecord;
import cn.edu.bjtu.sad.util.DBUtilFactory;

/**
 * RegisterRecordDaoImp class description
 * code This Class is implement RegisterRecord Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see RegisterRecordDao
 */
public class RegisterRecordDaoImp implements RegisterRecordDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	/**
	 * delete register element from table by id
	 * if the action is do correct,return true,else return false
	 * @param register_id
	 * @return boolean
	 */
	public boolean deleteRegisterRecord(String register_id){
		String sql = "delete from registerrecord where register_id = ?;";
		
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, register_id);
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
	 * add RegisterRecord element into table
	 * if the action is do correct,return this record register_id,
	 * else return -1
	 * @param register
	 * @return register_id
	 */
	public int addRegisterRecord(RegisterRecord register){
		String sql = "INSERT INTO `outpatient`.`registerrecord` "
				+ "(`doctor_id`, `patient_id`, `register_time`, "
				+ "`register_price`, `department_id`, `trade_id`) "
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, register.getDoctor_id());
			ps.setInt(2, register.getPatient_id());
			ps.setString(3, register.getRegister_time());
			ps.setDouble(4, register.getRegister_price());
			ps.setInt(5, register.getDepartment_id());
			ps.setInt(6, register.getTrade_id());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int register_id = -1;
		sql = "select max(register_id) as id from registerrecord;";
		conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				register_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return register_id;
	}
	
	/**
	 * get all RegisterRecord element from table
	 * if the action is do correct,return the list of RegisterRecord,
	 * else return null
	 * @return list
	 */
	public ArrayList<RegisterRecord> getRegisterRecord() {
		ArrayList<RegisterRecord> list = new ArrayList<RegisterRecord>();
		String sql = "select * from registerrecord;";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				RegisterRecord register = new RegisterRecord();
				// stupid set method......
				register.setDepartment_id(rs.getInt("dempartment_id"));
				register.setDoctor_id(rs.getInt("doctor_id"));
				register.setPatient_id(rs.getInt("patient_id"));
				register.setRegister_id(rs.getInt("register_id"));
				register.setRegister_price(rs.getDouble("register_price"));
				register.setRegister_time(rs.getString("register_time"));
				register.setTrade_id(rs.getInt("trade_id"));
				list.add(register);
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
	 * get all RegisterRecord element from table by id
	 * if the action is do correct return the RegisterRecord entity,
	 * else return null
	 * @param register_id
	 * @return register
	 */
	public RegisterRecord getRegisterRecord(int register_id) {
		RegisterRecord register = new RegisterRecord();
		String sql = "select * from registerrecord where register_id = ?;";
		Connection conn = new DBUtilFactory().getMysqlConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, register_id);
			rs = ps.executeQuery();
			if (rs.next()) {
				// stupid set method......
				register.setDepartment_id(rs.getInt("dempartment_id"));
				register.setDoctor_id(rs.getInt("doctor_id"));
				register.setPatient_id(rs.getInt("patient_id"));
				register.setRegister_id(rs.getInt("register_id"));
				register.setRegister_price(rs.getDouble("register_price"));
				register.setRegister_time(rs.getString("register_time"));
				register.setTrade_id(rs.getInt("trade_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			clearUp(conn);
		}
		return register;
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
