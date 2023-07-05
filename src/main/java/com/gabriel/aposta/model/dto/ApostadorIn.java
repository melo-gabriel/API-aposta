package com.gabriel.aposta.model.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.gabriel.aposta.model.Apostador;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApostadorIn {
	
	@NotBlank
	private String nome;
	
	@NotBlank
	@Email
	private String email;

	public Apostador toConvert() {
		return new Apostador(null, nome, email);
		
	}
}
