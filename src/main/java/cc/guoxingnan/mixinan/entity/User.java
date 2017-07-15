package cc.guoxingnan.mixinan.entity;

import java.io.Serializable;

public class User implements Serializable{
	private String mi_user_id;
	private String mi_user_name;
	private String mi_user_password;
	private String mi_user_gender;
	
	public String getMi_user_id() {
		return mi_user_id;
	}
	public void setMi_user_id(String mi_user_id) {
		this.mi_user_id = mi_user_id;
	}
	public String getMi_user_name() {
		return mi_user_name;
	}
	public void setMi_user_name(String mi_user_name) {
		this.mi_user_name = mi_user_name;
	}
	public String getMi_user_password() {
		return mi_user_password;
	}
	public void setMi_user_password(String mi_user_password) {
		this.mi_user_password = mi_user_password;
	}
	public String getMi_user_gender() {
		return mi_user_gender;
	}
	public void setMi_user_gender(String mi_user_gender) {
		this.mi_user_gender = mi_user_gender;
	}
	@Override
	public String toString() {
		return "User [mi_user_id=" + mi_user_id + ", mi_user_name=" + mi_user_name + ", mi_user_password="
				+ mi_user_password + ", mi_user_gender=" + mi_user_gender + "]";
	}
	public User() {
	}
	public User(String mi_user_id, String mi_user_name, String mi_user_password, String mi_user_gender) {
		super();
		this.mi_user_id = mi_user_id;
		this.mi_user_name = mi_user_name;
		this.mi_user_password = mi_user_password;
		this.mi_user_gender = mi_user_gender;
	}
	
	
}