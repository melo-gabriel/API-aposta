package com.gabriel.aposta.model.dto;

import com.gabriel.aposta.model.Apostador;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApostadorIn {
	
	private String nome;
	private String email;

	public Apostador toConvert() {
		return new Apostador(null, nome, email);
		
	}
}
