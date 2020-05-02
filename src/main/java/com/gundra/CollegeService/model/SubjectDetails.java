package com.gundra.CollegeService.model;

public class SubjectDetails {
	
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public SubjectDetails(){
		
	}
	
	
	private int subId;
	public SubjectDetails(int subId, String subName, String deptName) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.deptName = deptName;
	}


	private String subName;
	private String deptName;

}
