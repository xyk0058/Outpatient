package cn.edu.bjtu.sad.model;

public class Patient {
	private int patient_id;
	private String patient_name;
	private String patient_sex;
	private int patient_age;
	private String idcard_number;
	private String phone_number;
	private int hcard_id;
	private int user_id;
	private User user;
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_sex() {
		return patient_sex;
	}
	public void setPatient_sex(String patient_sex) {
		this.patient_sex = patient_sex;
	}
	public int getPatient_age() {
		return patient_age;
	}
	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}
	public String getIdcard_number() {
		return idcard_number;
	}
	public void setIdcard_number(String idcard_number) {
		this.idcard_number = idcard_number;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public int getHcard_id() {
		return hcard_id;
	}
	public void setHcard_id(int hcard_id) {
		this.hcard_id = hcard_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
