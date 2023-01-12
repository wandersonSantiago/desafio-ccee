package com.ccee.api.dtos;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompraDTO {

	  private List<BigDecimal> valor;
}
