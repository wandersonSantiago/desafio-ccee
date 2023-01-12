package com.ccee.api.dtos;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrecoMedioDTO {

	 private List<BigDecimal> valor;
}
