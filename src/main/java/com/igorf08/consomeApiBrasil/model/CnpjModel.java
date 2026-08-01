package com.igorf08.consomeApiBrasil.model;

import com.igorf08.consomeApiBrasil.model.enums.PorteEnum;

public record CnpjModel(String cnpj,
         String uf,
         String cep,
         String email,
         PorteEnum porte,
         String bairro,
         String municipio,
         String logradouro){

}
