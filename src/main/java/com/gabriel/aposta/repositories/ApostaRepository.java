package com.gabriel.aposta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gabriel.aposta.model.Aposta;

@Repository
public interface ApostaRepository extends JpaRepository<Aposta, String> {

	@Query(value = "SELECT * FROM TB_APOSTA WHERE ID_APOSTADOR = ?", nativeQuery = true)
	List<Aposta> findByIdApostador(@Param("idApostador") Long idApostador);
} 
