package com.PPMTool.PPM.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.PPMTool.PPM.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
}
