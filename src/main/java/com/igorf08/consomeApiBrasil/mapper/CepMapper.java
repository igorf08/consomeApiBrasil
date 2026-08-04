package com.igorf08.consomeApiBrasil.mapper;

import com.igorf08.consomeApiBrasil.dto.CepResponseDTO;
import com.igorf08.consomeApiBrasil.dto.CepViewDTO;
import com.igorf08.consomeApiBrasil.utils.CepUtils;
import org.springframework.stereotype.Component;

@Component
public class CepMapper {

    public CepViewDTO toViewDTO(CepResponseDTO response) {
        return new CepViewDTO(
                CepUtils.formatCep(response.cep()),
                response.state(),
                response.city(),
                response.neighborhood(),
                response.street()
        );
    }

}
