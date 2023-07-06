package com.gabriel.aposta.controllers;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gabriel.aposta.model.dto.ApostadorIn;
import com.gabriel.aposta.services.ApostadorService;

@ExtendWith(MockitoExtension.class)
public class ApostadorControllerTest {

	@InjectMocks
	private ApostadorController apostadorController;

	@Mock
	private ApostadorService apostadorService;

	private ApostadorIn apostadorIn;

	@BeforeEach
	void setup() {
		apostadorIn = new ApostadorIn("Gabriel", "gabriel@gmail.com");
	}

	@Test
	void deveSalvarApostador() {
		var response = assertDoesNotThrow(() -> apostadorController.salvarApostador(apostadorIn));
		assertEquals(ResponseEntity.status(HttpStatus.CREATED).build(), response);
	}

}
