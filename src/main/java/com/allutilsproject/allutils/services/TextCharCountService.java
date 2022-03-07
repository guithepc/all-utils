package com.allutilsproject.allutils.services;

import org.springframework.stereotype.Service;

@Service
public class TextCharCountService {

	public int textCharCount(String text) {
		int result = text.trim().length();
		return result;
	}
	
}
