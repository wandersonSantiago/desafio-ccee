package com.ccee.domain.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Regiao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Long id;
    private String sigla;
	@OneToMany(cascade = CascadeType.ALL)
    private List<Compra> compras;
	@OneToMany(cascade = CascadeType.ALL)
    private List<Geracao> geracoes;
	@OneToMany(cascade = CascadeType.ALL)
    private List<PrecoMedio> precosMedio;
}
