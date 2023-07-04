package com.gabriel.aposta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.aposta.entities.Apostador;
import com.gabriel.aposta.in.ApostadorIn;
import com.gabriel.aposta.repositories.ApostadorRepository;

@RestController
public class ApostaController {
	
	@Autowired
	private ApostadorRepository apostadorRepository;
	
	@PostMapping("/apostador")
	public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn) {
		Apostador apostador = apostadorIn.toConvert();
		apostadorRepository.save(apostador);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
