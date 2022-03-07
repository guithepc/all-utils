package com.allutilsproject.allutils.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allutilsproject.allutils.model.entities.CharAddingDTO;
import com.allutilsproject.allutils.services.AddCharService;
import com.allutilsproject.allutils.services.TextCharCountService;

@RestController
@RequestMapping("/services")
public class FirstController {
	
	@Autowired
	private AddCharService addCharService;
	
	@Autowired
	private TextCharCountService textCharCountService;
	
	@PostMapping(value="/add-char")
	public ResponseEntity<String> addChar(@RequestBody CharAddingDTO entity) {
		String result = addCharService.addChar(entity);
		
		return ResponseEntity.ok().body(result);
			
		}
	
	@PostMapping(value="/text-size")
	public ResponseEntity<Integer> textSize(@RequestBody String text){
		int result = textCharCountService.textCharCount(text);
		return ResponseEntity.ok().body(result);
		
	}
	
	
	
	
		

}
