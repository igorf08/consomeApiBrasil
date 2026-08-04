package com.igorf08.consomeApiBrasil.mapper;


import com.igorf08.consomeApiBrasil.dto.CnpjResponseDTO;
import com.igorf08.consomeApiBrasil.dto.CnpjViewDTO;
import com.igorf08.consomeApiBrasil.utils.CepUtils;
import com.igorf08.consomeApiBrasil.utils.CnpjUtils;
import org.springframework.stereotype.Component;

@Component
public class CnpjMapper {

    public CnpjViewDTO toCnpjView(CnpjResponseDTO response) {
        return new CnpjViewDTO(
                CnpjUtils.cnpjFormat(response.cnpj()),
                response.uf(),
                CepUtils.formatCep(response.cep()),
                response.email(),
                response.porte(),
                response.bairro(),
                response.municipio(),
                response.logradouro()
            );
    }

}
