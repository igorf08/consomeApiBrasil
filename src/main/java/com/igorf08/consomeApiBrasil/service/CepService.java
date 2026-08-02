package com.igorf08.consomeApiBrasil.service;

import com.igorf08.consomeApiBrasil.dto.CepResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    private final RestTemplate restTemplate;

    public CepService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CepResponseDTO buscaCep(String cep) {
        String url = "https://brasilapi.com.br/api/cep/v2/{cep}";
        return restTemplate.getForObject(url, CepResponseDTO.class, cep);
    };

}
