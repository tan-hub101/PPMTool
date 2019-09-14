package com.PPMTool.PPM.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PPMTool.PPM.domain.Project;
import com.PPMTool.PPM.exception.ProjectIdException;
import com.PPMTool.PPM.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		try{
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
			
		}catch(Exception e) {
			throw new ProjectIdException("Project ID already exists.");
		}
		
	}

}
