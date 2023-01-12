package com.ccee.domain.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Agente {

	@Id
	private Long codigo;
	private String data;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Regiao> regioes;
}
