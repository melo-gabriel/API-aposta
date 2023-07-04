package com.gabriel.aposta.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApostaOut {
	
	private String numeroAposta;
	private String nomeApostador;
	private String emailApostador;

}
