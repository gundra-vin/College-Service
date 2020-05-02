package com.gundra.CollegeService.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubjectResponse {
	
	@JsonProperty("subjectResponse")
	private List<Subject> subjectResponse;

	public List<Subject> getSubjectResponse() {
		return subjectResponse;
	}

	public void setSubjectResponse(List<Subject> subjectResponse) {
		this.subjectResponse = subjectResponse;
	}

}
