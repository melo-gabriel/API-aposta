package com.gabriel.aposta.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.aposta.model.dto.ApostaIn;
import com.gabriel.aposta.model.dto.ApostaOut;
import com.gabriel.aposta.model.dto.ApostasOut;
import com.gabriel.aposta.services.ApostaService;

@RestController
public class ApostaController {

	@Autowired
	private ApostaService apostaService;

	@PostMapping("/aposta")
	public ResponseEntity<ApostaOut> salvaAposta(@Valid @RequestBody ApostaIn apostaIn) {
		ApostaOut apostaOut = apostaService.salvaAposta(apostaIn);
		return ResponseEntity.status(HttpStatus.CREATED).body(apostaOut);
	}

	@GetMapping("/aposta/buscaAposta/{idApostador}")
	public List<ApostasOut> findByIdApostador(@PathVariable Long idApostador) {
		return apostaService.findByIdApostador(idApostador);

	}

}
