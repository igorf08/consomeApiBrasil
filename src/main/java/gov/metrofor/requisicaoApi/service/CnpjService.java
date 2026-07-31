package gov.metrofor.requisicaoApi.service;

import gov.metrofor.requisicaoApi.model.CnpjModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class CnpjService {

    public CnpjModel buscaCnpj(String cnpj) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://brasilapi.com.br/api/cnpj/v1/{cnpj}";
        return restTemplate.getForObject(url, CnpjModel.class, cnpj);
    }

}
