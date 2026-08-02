package com.igorf08.consomeBrasilAPI.service;

import com.igorf08.consomeBrasilAPI.model.CnpjModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CnpjService {

    private final RestTemplate restTemplate;

    public CnpjService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CnpjModel buscaCnpj(String cnpj) {
        String url = "https://brasilapi.com.br/api/cnpj/v1/{cnpj}";
        return restTemplate.getForObject(url, CnpjModel.class, cnpj);
    }

}
