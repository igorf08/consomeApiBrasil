package com.igorf08.consomeApiBrasil.controller;

import com.igorf08.consomeApiBrasil.dto.CepResponseDTO;
import com.igorf08.consomeApiBrasil.dto.CepViewDTO;
import com.igorf08.consomeApiBrasil.mapper.CepMapper;
import com.igorf08.consomeApiBrasil.service.CepService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CepController {

    private final CepService cepService;
    private final CepMapper cepMapper;


    public CepController(CepService cepService, CepMapper cepMapper) {
        this.cepService = cepService;
        this.cepMapper = cepMapper;
    }

    @GetMapping("/consulta-cep")
    public String paginaInicial() {
        return "busca-cep";
    };

    @GetMapping("/consulta-cep/buscar")
    public String buscarCep(@RequestParam(value = "cep", required = false) String cep, Model model) {
        if (cep != null && !cep.isBlank()) {
            CepResponseDTO resultado = cepService.buscaCep(cep);
            CepViewDTO viewDTO = cepMapper.toViewDTO(resultado);
            model.addAttribute("resultadoCep", viewDTO);
        }
        return "busca-cep";
    };

}
