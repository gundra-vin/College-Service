package com.gundra.CollegeService.model;

public class Subject {
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	public Subject(){
		
	}
	
	
	public Subject(int subId, int deptId, String subName) {
		super();
		this.subId = subId;
		this.deptId = deptId;
		this.subName = subName;
	}
	private int subId;
	private int deptId;
	private String subName;

}
