package com.srijan.springboot.learn_spring_boot_srijan;

public class Course {
	
	private long id;
	private String name;
	private String aurthor;
	
	public Course(long id, String name, String aurthor) {
		super();
		this.id = id;
		this.name = name;
		this.aurthor = aurthor;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAurthor() {
		return aurthor;
	}
	public void setAurthor(String aurthor) {
		this.aurthor = aurthor;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", aurthor=" + aurthor + "]";
	}
	
	
	

}
