package com.igorf08.consomeBrasilAPI.dto;

public record CepViewDTO(
    String cepFormatado,
    String estado,
    String cidade,
    String bairro,
    String rua
) {}
