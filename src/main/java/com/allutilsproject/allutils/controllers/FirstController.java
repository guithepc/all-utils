package com.allutilsproject.allutils.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allutilsproject.allutils.model.entities.CharAddingDTO;
import com.allutilsproject.allutils.services.AddCharService;

@RestController
@RequestMapping("/services")
public class FirstController {
	
	@Autowired
	private AddCharService addCharService;
	
	@PostMapping(value="/add-char")
	public ResponseEntity<String> addChar(@RequestBody CharAddingDTO entity) {
		String result = addCharService.addChar(entity);
		
		return ResponseEntity.ok().body(result);
			
		}
		

}
