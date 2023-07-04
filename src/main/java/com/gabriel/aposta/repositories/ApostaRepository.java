package com.gabriel.aposta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.aposta.model.Aposta;

@Repository
public interface ApostaRepository extends JpaRepository<Aposta, String> {

}
