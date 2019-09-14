package com.PPMTool.PPM.services;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class MapErrorValidationService {
	
	public Map<String,String> validateMap(BindingResult result) {
		
		if(result.hasErrors()) {
			Map<String,String> map = new HashMap<>();
			for(FieldError error : result.getFieldErrors()) {
				map.put(error.getField(), error.getDefaultMessage());
			}
			return map;
		}
		return null;
	}

}
