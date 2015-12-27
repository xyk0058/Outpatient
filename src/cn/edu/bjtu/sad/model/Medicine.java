package cn.edu.bjtu.sad.model;

public class Medicine {
	private int medicine_id;
	private String medicine_name;
	private String medicine_info;
	private double medicine_price;
	private int medicine_num;
	
	public int getMedicine_id() {
		return medicine_id;
	}
	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}
	public String getMedicine_name() {
		return medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}
	public String getMedicine_info() {
		return medicine_info;
	}
	public void setMedicine_info(String medicine_info) {
		this.medicine_info = medicine_info;
	}
	public double getMedicine_price() {
		return medicine_price;
	}
	public void setMedicine_price(double medicine_price) {
		this.medicine_price = medicine_price;
	}
	public int getMedicine_num() {
		return medicine_num;
	}
	public void setMedicine_num(int medicine_num) {
		this.medicine_num = medicine_num;
	}
}
