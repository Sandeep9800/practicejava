package com.school;

public class Student {
	private int sno;
	private String name;
	private int marks;
	protected int getSno() {
		return sno;
	}
	protected void setSno(int sno) {
		this.sno = sno;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getMarks() {
		return marks;
	}
	protected void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
