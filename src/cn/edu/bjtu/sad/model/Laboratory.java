package cn.edu.bjtu.sad.model;

public class Laboratory {
	private int laboratory_id;
	private String laboratory_name;
	private int patient_id;
	private int doctor_id;
	private String report;
	private int trade_id;
	
	public int getTrade_id() {
		return trade_id;
	}
	public void setTrade_id(int trade_id) {
		this.trade_id = trade_id;
	}
	public int getLaboratory_id() {
		return laboratory_id;
	}
	public void setLaboratory_id(int laboratory_id) {
		this.laboratory_id = laboratory_id;
	}
	public String getLaboratory_name() {
		return laboratory_name;
	}
	public void setLaboratory_name(String laboratory_name) {
		this.laboratory_name = laboratory_name;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
}
