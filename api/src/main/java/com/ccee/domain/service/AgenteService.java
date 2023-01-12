package com.ccee.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccee.domain.model.Agente;
import com.ccee.domain.repository.AgenteRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class AgenteService {
	
	private final AgenteRepository repository;


	public Agente save(Agente agente) {
		return repository.save(agente);
	}
	
	public List<Agente> findByRegiao(String regiao) {
		return repository.findByRegioesSigla(regiao);
	}
}
