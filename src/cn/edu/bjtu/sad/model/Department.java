package cn.edu.bjtu.sad.model;

public class Department {
	
	private int department_id;
	private String department_name;
	private String department_detail;
	private int avaliable_num;
	
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDepartment_detail() {
		return department_detail;
	}
	public void setDepartment_detail(String department_detail) {
		this.department_detail = department_detail;
	}
	public int getAvaliable_num() {
		return avaliable_num;
	}
	public void setAvaliable_num(int avaliable_num) {
		this.avaliable_num = avaliable_num;
	}
	
}
