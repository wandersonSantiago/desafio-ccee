package com.ccee.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PrecoMedio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private Long id;

	@ElementCollection
	@CollectionTable(name="valores_preco_medio")
	private List<BigDecimal> valor = new ArrayList<>();
	
	
	public void setValor(List<BigDecimal> valor) {
		
		valor.forEach(v ->{
		   v.valueOf(0);
		});
	}
}
