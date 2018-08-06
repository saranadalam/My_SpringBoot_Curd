package com.springcrud.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jdbccurd")
public class StudentEntity {
	
	@Column
	public String sname;
	@Id
	@Column
	public int sid;
	@Column
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
		return "Entity [sname=" + sname + ", sid=" + sid + ", snumber=" + snumber + "]";
	}
	

}
