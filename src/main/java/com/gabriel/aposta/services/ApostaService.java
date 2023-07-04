package com.gabriel.aposta.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.aposta.model.Aposta;
import com.gabriel.aposta.model.Apostador;
import com.gabriel.aposta.model.dto.ApostaIn;
import com.gabriel.aposta.model.dto.ApostaOut;
import com.gabriel.aposta.repositories.ApostaRepository;
import com.gabriel.aposta.repositories.ApostadorRepository;

@Service
public class ApostaService {

	@Autowired
	private ApostadorRepository apostadorRepository;
	
	@Autowired
	private ApostaRepository apostaRepository;
	
	public ApostaOut salvaAposta( ApostaIn apostaIn) {
		Optional<Apostador> apostador = apostadorRepository.findById(apostaIn.getIdApostador());
		String numAposta = UUID.randomUUID().toString();
		Aposta aposta = new Aposta(numAposta, apostador.get());
		apostaRepository.save(aposta);
		
		return new ApostaOut(numAposta, apostador.get().getNome(), apostador.get().getEmail());
	}
}
