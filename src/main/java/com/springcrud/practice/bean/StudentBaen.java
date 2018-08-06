package com.springcrud.practice.bean;

public class StudentBaen {
	//Setters and getters , toString
	public String sname;
	public int sid;
	public int snumber;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSnumber() {
		return snumber;
	}
	public void setSnumber(int snumber) {
		this.snumber = snumber;
	}
	@Override
	public String toString() {
		return "StudentBaen [sname=" + sname + ", sid=" + sid + ", snumber=" + snumber + "]";
	}
	
	
	

}
