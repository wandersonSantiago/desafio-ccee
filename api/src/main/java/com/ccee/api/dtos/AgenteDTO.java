package com.ccee.api.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AgenteDTO {

	private Long codigo;
	private String data;
	private List<RegiaoDTO> regioes;
}
