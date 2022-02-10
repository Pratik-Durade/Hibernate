package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="student")
@Entity
public class Student {
	@Id
	@Column(name="sid")
	private int sid;
	
	@Column(name="name")
	private String sname;
	
	@Column(name="marks")
	private int marks;

	
//	public Student(int sid, String sname, int marks) {
//		super();
//		this.sid = sid;
//		this.sname = sname;
//		this.marks = marks;
//	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
	

}