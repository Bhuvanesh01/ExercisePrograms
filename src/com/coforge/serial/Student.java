package com.coforge.serial;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
//	private static final long serialVersionUID = 2L;
	String name;
	int id;
//	String state;
	transient String hobby;
	public Student(String name, int id, String state) {
		super();
		this.name = name;		this.id = id;
		this.hobby = hobby;
//		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id +", hobby=" + hobby + "]";
	}
	
}
