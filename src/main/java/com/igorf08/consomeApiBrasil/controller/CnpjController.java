package com.igorf08.consomeApiBrasil.controller;

import com.igorf08.consomeApiBrasil.dto.CnpjResponseDTO;
import com.igorf08.consomeApiBrasil.dto.CnpjViewDTO;
import com.igorf08.consomeApiBrasil.mapper.CnpjMapper;
import com.igorf08.consomeApiBrasil.service.CnpjService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CnpjController {

    private final CnpjService cnpjService;
    private final CnpjMapper cnpjMapper;

    public CnpjController(CnpjService cnpjService, CnpjMapper cnpjMapper) {

        this.cnpjService = cnpjService;
        this.cnpjMapper = cnpjMapper;
    }

    @GetMapping("/consulta-cnpj")
    public String paginaInicial() {
        return "busca-cnpj";
    }

    @GetMapping("/consulta-cnpj/buscar")
    public String buscarCnpj(@RequestParam(name = "cnpj") String cnpj, Model model) {

        if (cnpj != null && !cnpj.isBlank()) {
            CnpjResponseDTO resultado = cnpjService.buscaCnpj(cnpj);
            CnpjViewDTO viewDTO = cnpjMapper.toCnpjView(resultado);
            model.addAttribute("resultadoCnpj", viewDTO);
        }

        return "busca-cnpj";

    }
}
