package com.ccee.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccee.domain.model.Agente;


public interface AgenteRepository extends JpaRepository<Agente, Long>{

	List<Agente> findByRegioesSigla(String regiao);


}
