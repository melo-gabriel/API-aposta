package com.gabriel.aposta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.aposta.model.dto.ApostadorIn;
import com.gabriel.aposta.services.ApostaorService;

@RestController
public class ApostaController {
	
	@Autowired
	private ApostaorService apostadorService;
	
	@PostMapping("/apostador")
	public ResponseEntity salvarApostador(@RequestBody ApostadorIn apostadorIn) {
		apostadorService.salvaApostador(apostadorIn);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
