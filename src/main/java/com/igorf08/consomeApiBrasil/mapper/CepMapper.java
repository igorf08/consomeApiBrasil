package com.igorf08.consomeApiBrasil.mapper;

import com.igorf08.consomeApiBrasil.dto.CepResponseDTO;
import com.igorf08.consomeApiBrasil.model.CepModel;
import org.springframework.stereotype.Component;

@Component
public class CepMapper {

    public CepModel toModel(CepResponseDTO response) {
        return new CepModel(
                response.cep(),
                response.state(),
                response.city(),
                response.neighborhood(),
                response.street()
        );
    }

    public CepResponseDTO toResponse(CepModel response) {
        return new CepResponseDTO(
                response.getCep(),
                response.getState(),
                response.getCity(),
                response.getNeighborhood(),
                response.getStreet()
        );
    }
}
