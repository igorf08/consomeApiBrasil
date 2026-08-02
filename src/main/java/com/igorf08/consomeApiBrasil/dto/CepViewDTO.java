package com.igorf08.consomeApiBrasil.dto;

public record CepViewDTO(
    String cepFormatado,
    String estado,
    String cidade,
    String bairro,
    String rua
) {}
