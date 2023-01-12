package com.ccee.api.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegiaoDTO {

    private String sigla;
    private List<CompraDTO> compras;
    private List<GeracaoDTO> geracoes;
    private List<PrecoMedioDTO> precosMedio;
}
