package com.ccee.api.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegiaoDTO {

    private String sigla;
    private CompraDTO compra;
    private GeracaoDTO geracao;
    //private PrecoMedioDTO precoMedio;
}
