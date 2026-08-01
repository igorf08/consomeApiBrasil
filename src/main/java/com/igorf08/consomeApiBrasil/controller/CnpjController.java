package com.igorf08.consomeApiBrasil.controller;

import com.igorf08.consomeApiBrasil.model.CnpjModel;
import com.igorf08.consomeApiBrasil.service.CnpjService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClientException;

@Controller
public class CnpjController {

    private final CnpjService cnpjService;

    public CnpjController(CnpjService cnpjService) {
        this.cnpjService = cnpjService;
    }

    @GetMapping("/consulta-cnpj")
    public String paginaInicial() {
        return "busca-cnpj";
    }

    @GetMapping("/consulta-cnpj/buscar")
    public String buscarCnpj(@RequestParam(name = "cnpj") String cnpj, Model model) {
        if (cnpj != null && !cnpj.isBlank()) {
            try {
                CnpjModel resultado = cnpjService.buscaCnpj(cnpj);
                model.addAttribute("resultadoCnpj", resultado);
            } catch (RestClientException e) {
                model.addAttribute("erro", "Não foi possível encontrar o CNPJ informado!");
            }
        }
        return "busca-cnpj";
    }
}
