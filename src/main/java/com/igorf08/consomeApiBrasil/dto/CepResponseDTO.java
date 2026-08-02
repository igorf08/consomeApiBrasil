package com.igorf08.consomeApiBrasil.dto;

public record CepResponseDTO(
    String cep,
    String state,
    String city,
    String neighborhood,
    String street,
    String service
) {}
