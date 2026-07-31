package gov.metrofor.requisicaoApi.controller;

import gov.metrofor.requisicaoApi.CepResultDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class ApiController {

    @GetMapping("/consulta-cep")
    public String paginaInicial() {
        return "busca-cep"; //Vai buscar busca-cep.html em templates.
    };

    @GetMapping("/consulta-cep/buscar")
    public String buscarCep(@RequestParam(value = "cep", required = false) String cep, Model model) { //Aqui ele irá pegar ?cep="..."
        if (cep != null && !cep.isBlank()) {
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://brasilapi.com.br/api/cep/v2/{cep}";
            try {
                CepResultDTO resultado = restTemplate.getForObject(url, CepResultDTO.class, cep); //Vai passar a url, o que ele montará com os dados (que é a instância de cepresultdto e usará o Cep pra preencher a url).
                model.addAttribute("resultadoCep", resultado);
                model.addAttribute("cepBuscado", cep);
            } catch (Exception e) {
                model.addAttribute("erro", "Não foi possível buscar o CEP informado!");
            }
        }
        return "busca-cep";
    };



}
