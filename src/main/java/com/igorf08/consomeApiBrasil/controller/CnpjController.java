package com.igorf08.consomeApiBrasil.controller;

import com.igorf08.consomeApiBrasil.dto.CnpjResponseDTO;
import com.igorf08.consomeApiBrasil.dto.CnpjViewDTO;
import com.igorf08.consomeApiBrasil.service.CnpjService;
import com.igorf08.consomeApiBrasil.utils.CnpjUtils;
import com.igorf08.consomeApiBrasil.utils.CepUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
            CnpjResponseDTO resultado = cnpjService.buscaCnpj(cnpj);
            CnpjViewDTO viewDTO = new CnpjViewDTO(
                CnpjUtils.cnpjFormat(resultado.cnpj()),
                resultado.uf(),
                CepUtils.formatCep(resultado.cep()),
                resultado.email(),
                resultado.porte(),
                resultado.bairro(),
                resultado.municipio(),
                resultado.logradouro()
            );
            model.addAttribute("resultadoCnpj", viewDTO);
        }
        return "busca-cnpj";
    }
}
