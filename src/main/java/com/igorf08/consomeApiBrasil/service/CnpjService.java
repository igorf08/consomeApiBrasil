package com.igorf08.consomeApiBrasil.service;

import com.igorf08.consomeApiBrasil.dto.CnpjResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CnpjService {

    private final RestTemplate restTemplate;

    public CnpjService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CnpjResponseDTO buscaCnpj(String cnpj) {
        String url = "https://brasilapi.com.br/api/cnpj/v1/{cnpj}";
        return restTemplate.getForObject(url, CnpjResponseDTO.class, cnpj);
    }

}
