package cn.edu.bjtu.sad.model;

public class Doctor {
	private int doctor_id;
	private String doctor_name;
	private String doctor_sex;
	private String doctor_level;
	private int doctor_score;
	private int department_id;
	private int role_id;
	
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getDoctor_sex() {
		return doctor_sex;
	}
	public void setDoctor_sex(String doctor_sex) {
		this.doctor_sex = doctor_sex;
	}
	public String getDoctor_level() {
		return doctor_level;
	}
	public void setDoctor_level(String doctor_level) {
		this.doctor_level = doctor_level;
	}
	public int getDoctor_score() {
		return doctor_score;
	}
	public void setDoctor_score(int doctor_score) {
		this.doctor_score = doctor_score;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
}
