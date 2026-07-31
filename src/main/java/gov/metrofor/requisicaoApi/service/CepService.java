package gov.metrofor.requisicaoApi.service;

import gov.metrofor.requisicaoApi.model.CepModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    public CepModel buscaCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://brasilapi.com.br/api/cep/v2/{cep}";
        return restTemplate.getForObject(url, CepModel.class, cep);
    };

}
