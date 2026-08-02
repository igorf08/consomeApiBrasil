package com.igorf08.consomeApiBrasil.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    public String handleHttpClientErrorException(HttpClientErrorException ex, Model model, HttpServletRequest request) {

        model.addAttribute("erro", "O dado informado não foi encontrado na base da BrasilAPI.");

        String urlErro = request.getRequestURI();

        if (urlErro.contains("consulta-cnpj")) {
            return "busca-cnpj";
        }

        if (urlErro.contains("consulta-cep")){
            return "busca-cep";
        }



        return "index";

    }
}
