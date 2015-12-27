package cn.edu.bjtu.sad.model;

public class TradeRecord {
	private int trade_id;
	private int patient_id;
	private double price;
	private String pre_time;
	private String final_time;
	private String trade_detail;
	private String isPrePay;
	private String isFinalPay;
	
	
	public int getTrade_id() {
		return trade_id;
	}
	public void setTrade_id(int trade_id) {
		this.trade_id = trade_id;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPre_time() {
		return pre_time;
	}
	public void setPre_time(String pre_time) {
		this.pre_time = pre_time;
	}
	public String getFinal_time() {
		return final_time;
	}
	public void setFinal_time(String final_time) {
		this.final_time = final_time;
	}
	public String getTrade_detail() {
		return trade_detail;
	}
	public void setTrade_detail(String trade_detail) {
		this.trade_detail = trade_detail;
	}
	public String getIsPrePay() {
		return isPrePay;
	}
	public void setIsPrePay(String isPrePay) {
		this.isPrePay = isPrePay;
	}
	public String getIsFinalPay() {
		return isFinalPay;
	}
	public void setIsFinalPay(String isFinalPay) {
		this.isFinalPay = isFinalPay;
	}
	
}
