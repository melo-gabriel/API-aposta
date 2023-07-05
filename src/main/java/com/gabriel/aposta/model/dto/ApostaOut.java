package com.gabriel.aposta.model.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApostaOut {

	@NotBlank
	private String numeroAposta;

	@NotBlank
	private String nomeApostador;

	@NotBlank
	@Email
	private String emailApostador;

}
