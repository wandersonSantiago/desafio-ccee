package com.ccee.domain.model;

import java.math.BigDecimal;

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
	private BigDecimal valor;
}
