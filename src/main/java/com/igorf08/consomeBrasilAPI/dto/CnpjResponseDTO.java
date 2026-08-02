package com.igorf08.consomeBrasilAPI.dto;

import com.igorf08.consomeBrasilAPI.dto.enums.PorteEnum;

public record CnpjResponseDTO(String cnpj,
                              String uf,
                              String cep,
                              String email,
                              PorteEnum porte,
                              String bairro,
                              String municipio,
                              String logradouro) {
}
