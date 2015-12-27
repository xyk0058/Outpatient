package cn.edu.bjtu.sad.dao;

import java.util.ArrayList;

import cn.edu.bjtu.sad.model.TradeRecord;

/**
 * This interface is used for operate trade record data.
 * @author sunshine
 *
 */
public interface TradeRecordDao {
	public boolean deleteTradeRocord(String trade_id);
	public int addTradeRecord (TradeRecord record);
	public ArrayList<TradeRecord> getTradeRecord();
	public TradeRecord getTradeRecord(int trade_id);
	
}
