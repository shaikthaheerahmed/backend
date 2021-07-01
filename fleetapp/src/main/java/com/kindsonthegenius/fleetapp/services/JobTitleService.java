package com.kindsonthegenius.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.JobTitle;
import com.kindsonthegenius.fleetapp.repositories.JobTitleRepository;

@Service
public class JobTitleService {
	@Autowired
	private JobTitleRepository  jobTitleRepository;
	//return list of countries
 

  //save the country
 public void save(JobTitle jobTitle) {
	 jobTitleRepository.save(jobTitle);
 }
 
 //get by id
 public Optional<JobTitle> findById(int id) {
	 return jobTitleRepository.findById(id);
	 
 }

public void delete(Integer id) {
	jobTitleRepository.deleteById(id);
	
}

public List<JobTitle> getJobTitles() {
	
	return jobTitleRepository.findAll();
}
}
