package com.gabriel.aposta.in;

import com.gabriel.aposta.entities.Apostador;

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
		return new Apostador(nome, email);
		
	}
}
