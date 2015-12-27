package cn.edu.bjtu.sad.model;

public class Hcard {
	private int hcard_id;
	private String idcard_number;
	private String phone_number;
	private String crash_card;
	
	public int getHcard_id() {
		return hcard_id;
	}
	public void setHcard_id(int hcard_id) {
		this.hcard_id = hcard_id;
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
	public String getCrash_card() {
		return crash_card;
	}
	public void setCrash_card(String crash_card) {
		this.crash_card = crash_card;
	}
}
