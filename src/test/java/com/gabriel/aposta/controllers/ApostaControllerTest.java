package com.gabriel.aposta.controllers;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull; 
import static org.junit.jupiter.api.Assertions.assertEquals; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.gabriel.aposta.model.dto.ApostaIn;
import com.gabriel.aposta.model.dto.ApostaOut;
import com.gabriel.aposta.services.ApostaService;

@ExtendWith(MockitoExtension.class)
public class ApostaControllerTest {
	
	@InjectMocks
	private ApostaController apostaController;
	
	@Mock
	private ApostaService apostaService;
	
	private ApostaIn apostaIn;
	
	private ApostaOut apostaOut;
	
	@BeforeEach
	void setup() {
		apostaIn = new ApostaIn(1L);
		apostaOut = new ApostaOut("123456", "Leticia", "Leticia@gmail.com");
	}
	
	@Test
	void deveSalvarAposta() {
		when(apostaService.salvaAposta(apostaIn)).thenReturn(apostaOut);
		var response = assertDoesNotThrow(() -> apostaController.salvaAposta(apostaIn));
		assertNotNull(response);
		assertEquals(ResponseEntity.status(HttpStatus.CREATED).body(apostaOut), response);
	}
	

}
