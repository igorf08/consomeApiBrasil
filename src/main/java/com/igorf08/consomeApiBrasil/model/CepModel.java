package com.igorf08.consomeApiBrasil.model;

public record CepModel(String cep,
                       String state,
                       String city,
                       String neighborhood,
                       String street) {
}
