package com.ccee.domain.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
    @ManyToOne(cascade = CascadeType.ALL)
    private Compra compra;
	@ManyToOne(cascade = CascadeType.ALL)
    private Geracao geracao;

}
