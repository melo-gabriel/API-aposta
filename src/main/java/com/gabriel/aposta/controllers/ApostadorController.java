package com.gabriel.aposta.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.aposta.model.dto.ApostadorIn;
import com.gabriel.aposta.services.ApostadorService;

@RestController
@RequestMapping("/apostador")
public class ApostadorController {
	
	@Autowired
	private ApostadorService apostadorService;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<?> salvarApostador(@Valid @RequestBody ApostadorIn apostadorIn) {
		apostadorService.salvaApostador(apostadorIn);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
}
