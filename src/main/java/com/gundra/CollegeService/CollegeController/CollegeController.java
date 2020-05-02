package com.gundra.CollegeService.CollegeController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gundra.CollegeService.model.Dept;
import com.gundra.CollegeService.model.Subject;
import com.gundra.CollegeService.model.SubjectDetails;
import com.gundra.CollegeService.model.SubjectResponse;

@RestController
public class CollegeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/subinfo")
	public List<SubjectDetails> getSubjectDetails(){
		SubjectResponse sr = restTemplate.getForObject("http://localhost:8074/getSubjects", SubjectResponse.class);
		List<Subject> sublst = sr.getSubjectResponse();
		List<SubjectDetails> sdl= new ArrayList<SubjectDetails>();
		sublst.stream().forEach(sub -> {
			
			Dept d1 = restTemplate.getForObject("http://localhost:8075/getDept/" +sub.getDeptId(), Dept.class);
			SubjectDetails sd = new SubjectDetails();
			sd.setSubId(sub.getSubId());
			sd.setSubName(sub.getSubName());
			sd.setDeptName(d1.getDeptName());
			sdl.add(sd);
		});
		
				
		return sdl;
	}

}
