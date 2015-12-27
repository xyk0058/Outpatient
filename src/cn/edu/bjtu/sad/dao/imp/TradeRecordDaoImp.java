package cn.edu.bjtu.sad.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.bjtu.sad.dao.TradeRecordDao;
import cn.edu.bjtu.sad.model.TradeRecord;
import cn.edu.bjtu.sad.util.DBUtilFactory;


/**
 * TradeRecordDaoImp class description
 * This Class is implement TradeRecord Table 
 * insert,update,delete and select function.
 * @author sunshine
 * @see TradeRecordDao
 */

public class TradeRecordDaoImp implements TradeRecordDao{
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	/**
	 * delete TradeRecord element from table by id
	 * if the action is do correct,return true,else return false
	 * @param trade_id
	 * @return boolean
	 */
	public boolean deleteTradeRocord(String trade_id){
		String sql = "delete from traderecord where trade_id = ?;";
		
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, trade_id);
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
	 * add TradeRecord element into table
	 * if the action is do correct,return this record record_id,
	 * else return -1
	 * @param record
	 * @return record_id
	 */
	public int addTradeRecord(TradeRecord record){
		String sql = "INSERT INTO `outpatient`.`traderecord` "
				+ "(`patient_id`, `price`, "
				+ "`pre_time`, `final_time`, `trade_detail`, "
				+ "`isPrePay`, `isFinalPay`) "
				+ "VALUES (NULL, NULL, NULL, NULL, NULL, NULL, NULL);";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, record.getPatient_id());
			ps.setDouble(2, record.getPrice());
			ps.setString(3, record.getPre_time());
			ps.setString(4, record.getFinal_time());
			ps.setString(5, record.getTrade_detail());
			ps.setString(6, record.getIsPrePay());
			ps.setString(7, record.getIsFinalPay());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		int trade_id = -1;
		sql = "select max(trade_id) as id from traderecord;";
		conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				trade_id = rs.getInt("id");
			}else{
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			clearUp(conn);
		}
		return trade_id;
	}
	

	/**
	 * get all TradeRecord element from table
	 * if the action is do correct,return the list of TradeRecord,
	 * else return null
	 * @return list
	 */
	public ArrayList<TradeRecord> getTradeRecord() {
		ArrayList<TradeRecord> list = new ArrayList<TradeRecord>();
		String sql = "select * from traderecord;";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				TradeRecord record = new TradeRecord();
				// stupid set method......
				record.setFinal_time(rs.getString("final_time"));
				record.setIsFinalPay(rs.getString("isFinalPay"));
				record.setIsPrePay(rs.getString("isPrePay"));
				record.setPatient_id(rs.getInt("patient_id"));
				record.setPre_time(rs.getString("pre_time"));
				record.setPrice(rs.getDouble("price"));
				record.setTrade_id(rs.getInt("trade_id"));
				record.setTrade_detail(rs.getString("trade_detail"));
				list.add(record);
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
	 * get all TradeRecord element from table by id
	 * if the action is do correct return the TradeRecord entity,
	 * else return null
	 * @param trade_id
	 * @return record
	 */
	public TradeRecord getTradeRecord(int trade_id) {
		TradeRecord record = new TradeRecord();
		String sql = "select * from traderecord where trade_id = ?;";
		Connection conn = new DBUtilFactory().getConn();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, trade_id);
			rs = ps.executeQuery();
			if (rs.next()) {
				// stupid set method......
				record.setFinal_time(rs.getString("final_time"));
				record.setIsFinalPay(rs.getString("isFinalPay"));
				record.setIsPrePay(rs.getString("isPrePay"));
				record.setPatient_id(rs.getInt("patient_id"));
				record.setPre_time(rs.getString("pre_time"));
				record.setPrice(rs.getInt("price"));
				record.setTrade_id(rs.getInt("trade_id"));
				record.setTrade_detail(rs.getString("trade_detail"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			clearUp(conn);
		}
		return record;
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
