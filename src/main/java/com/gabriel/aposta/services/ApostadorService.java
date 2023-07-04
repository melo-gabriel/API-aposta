package com.gabriel.aposta.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.aposta.model.Apostador;
import com.gabriel.aposta.model.dto.ApostadorIn;
import com.gabriel.aposta.repositories.ApostadorRepository;

@Service
public class ApostadorService {

	@Autowired
	private ApostadorRepository apostadorRepository;
	@Autowired
	private ModelMapper modelmapper;

	public void salvaApostador(ApostadorIn apostadorIn) {
		Apostador apostador = modelmapper.map(apostadorIn, Apostador.class);     
		apostadorRepository.save(apostador);

	}

}
