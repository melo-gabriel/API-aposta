package com.gabriel.aposta.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApostasOut {

	@NotBlank
	private String numeroAposta;

	@NotNull
	private Long idApostador;
}

