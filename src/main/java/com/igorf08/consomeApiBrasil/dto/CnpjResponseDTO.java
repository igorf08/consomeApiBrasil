package com.igorf08.consomeApiBrasil.dto;

import com.igorf08.consomeApiBrasil.dto.enums.PorteEnum;

public record CnpjResponseDTO(String cnpj,
                              String uf,
                              String cep,
                              String email,
                              PorteEnum porte,
                              String bairro,
                              String municipio,
                              String logradouro) {
}
