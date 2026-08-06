package com.igorf08.consomeApiBrasil.service;

import com.igorf08.consomeApiBrasil.dto.CepResponseDTO;
import com.igorf08.consomeApiBrasil.mapper.CepMapper;
import com.igorf08.consomeApiBrasil.model.CepModel;
import com.igorf08.consomeApiBrasil.repository.CepRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@Service
public class CepService {

    private final RestTemplate restTemplate;
    private final CepRepository repository;
    private final CepMapper mapper;

    public CepService(RestTemplate restTemplate, CepRepository repository, CepMapper mapper) {
        this.restTemplate = restTemplate;
        this.repository = repository;
        this.mapper = mapper;
    }

    public CepResponseDTO buscaCep(String cep) {
        String url = "https://brasilapi.com.br/api/cep/v2/{cep}";

        String decodedCep = URLDecoder.decode(cep, StandardCharsets.UTF_8);
        Optional<CepModel> buscaCepNoDb = repository.findByCep(decodedCep.replaceAll("[^a-zA-Z0-9]", ""));

        if (buscaCepNoDb.isPresent()) {
            CepModel cepModel = buscaCepNoDb.get();
            return mapper.toResponse(cepModel);
        }

        CepResponseDTO responseDTO = restTemplate.getForObject(url, CepResponseDTO.class, cep);

        CepModel cepModel = mapper.toModel(responseDTO);
        repository.save(cepModel);
        return responseDTO;
        
    };

}
