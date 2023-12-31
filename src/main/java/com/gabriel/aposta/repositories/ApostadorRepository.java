package com.gabriel.aposta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.aposta.model.Apostador;

@Repository
public interface ApostadorRepository  extends JpaRepository<Apostador, Long>{

}
