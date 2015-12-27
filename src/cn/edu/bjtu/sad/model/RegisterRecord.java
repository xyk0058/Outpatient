package cn.edu.bjtu.sad.model;

public class RegisterRecord {
	private int register_id;
	private int doctor_id;
	private int patient_id;
	private String register_time;
	private double register_price;
	private int department_id;
	private int trade_id;
	private RegisterRecord rsRecord;
	public int getRegister_id() {
		return register_id;
	}
	public void setRegister_id(int register_id) {
		this.register_id = register_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getRegister_time() {
		return register_time;
	}
	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}
	public double getRegister_price() {
		return register_price;
	}
	public void setRegister_price(double register_price) {
		this.register_price = register_price;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getTrade_id() {
		return trade_id;
	}
	public void setTrade_id(int trade_id) {
		this.trade_id = trade_id;
	}
	public RegisterRecord getRsRecord() {
		return rsRecord;
	}
	public void setRsRecord(RegisterRecord rsRecord) {
		this.rsRecord = rsRecord;
	}
}
