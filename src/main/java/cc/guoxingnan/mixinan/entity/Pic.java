package cc.guoxingnan.mixinan.entity;

import java.io.Serializable;

public class Pic implements Serializable{
	private Integer mi_pic_id;
	private String mi_pic_url;
	private String mi_pic_desc;
	private String mi_pic_create_time;
	
	
	
	public String getMi_pic_desc() {
		return mi_pic_desc;
	}
	public void setMi_pic_desc(String mi_pic_desc) {
		this.mi_pic_desc = mi_pic_desc;
	}
	public Integer getMi_pic_id() {
		return mi_pic_id;
	}
	public void setMi_pic_id(Integer mi_pic_id) {
		this.mi_pic_id = mi_pic_id;
	}
	public String getMi_pic_url() {
		return mi_pic_url;
	}
	public void setMi_pic_url(String mi_pic_url) {
		this.mi_pic_url = mi_pic_url;
	}
	public String getMi_pic_create_time() {
		return mi_pic_create_time;
	}
	public void setMi_pic_create_time(String mi_pic_create_time) {
		this.mi_pic_create_time = mi_pic_create_time;
	}
	
	@Override
	public String toString() {
		return "Pic [mi_pic_id=" + mi_pic_id + ", mi_pic_url=" + mi_pic_url + ", mi_pic_desc=" + mi_pic_desc
				+ ", mi_pic_create_time=" + mi_pic_create_time + "]";
	}
	
	
	
	
	
}
