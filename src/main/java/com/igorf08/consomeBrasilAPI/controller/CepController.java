package com.igorf08.consomeBrasilAPI.controller;

import com.igorf08.consomeBrasilAPI.model.CepModel;
import com.igorf08.consomeBrasilAPI.service.CepService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CepController {

    private final CepService cepService;

    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/consulta-cep")
    public String paginaInicial() {
        return "busca-cep";
    };

    @GetMapping("/consulta-cep/buscar")
    public String buscarCep(@RequestParam(value = "cep", required = false) String cep, Model model) {
        if (cep != null && !cep.isBlank()) {
            try {
                CepModel resultado = cepService.buscaCep(cep);
                model.addAttribute("resultadoCep", resultado);
            } catch (Exception e) {
                model.addAttribute("erro", "Não foi possível buscar o CEP informado.");
            }
        }
        return "busca-cep";
    };

}
