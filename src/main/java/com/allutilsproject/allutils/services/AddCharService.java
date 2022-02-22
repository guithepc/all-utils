package com.allutilsproject.allutils.services;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.allutilsproject.allutils.model.entities.CharAddingDTO;
@Service
public class AddCharService {
	
	public String addChar(CharAddingDTO entity) {
		
		if (entity.getPosition().equals("left")) {
			return StringUtils.leftPad(entity.getText(), entity.getSize(), entity.getNewChar());
		} else {
			return StringUtils.rightPad(entity.getText(), entity.getSize(), entity.getNewChar());
			
		}
	}
	
}
