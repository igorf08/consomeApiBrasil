package com.igorf08.consomeApiBrasil.mapper;


import com.igorf08.consomeApiBrasil.dto.CnpjResponseDTO;
import com.igorf08.consomeApiBrasil.model.CnpjModel;
import org.springframework.stereotype.Component;

@Component
public class CnpjMapper {

       public CnpjModel toModel(CnpjResponseDTO response) {
        return new CnpjModel(
                response.cnpj(),
                response.uf(),
                response.cep(),
                response.email(),
                response.porte(),
                response.bairro(),
                response.municipio(),
                response.logradouro()
            );
        }

        public CnpjResponseDTO toResponse(CnpjModel response) {
            return new CnpjResponseDTO(
                    response.getCnpj(),
                    response.getUf(),
                    response.getCep(),
                    response.getEmail(),
                    response.getPorte(),
                    response.getBairro(),
                    response.getMunicipio(),
                    response.getLogradouro()
            );
        }
}
