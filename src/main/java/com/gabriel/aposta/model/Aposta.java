package com.gabriel.aposta.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_APOSTA")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aposta {
	
	@Id
	@NotBlank
	private String numeroAposta;
	
	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private Apostador apostador;

}
