package com.igorf08.consomeApiBrasil.dto;

import com.igorf08.consomeApiBrasil.dto.enums.PorteEnum;

public record CnpjViewDTO(String cnpjFormatado,
                          String uf,
                          String cepFormatado,
                          String email,
                          PorteEnum porte,
                          String bairro,
                          String municipio,
                          String logradouro) {
}
