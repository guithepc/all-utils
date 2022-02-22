package com.allutilsproject.allutils.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CharAddingDTO {
	private String text;
	private int size;
	private String newChar;
	private String position;
	
	
}
