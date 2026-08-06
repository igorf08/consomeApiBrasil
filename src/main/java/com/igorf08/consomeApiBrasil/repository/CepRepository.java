package com.igorf08.consomeApiBrasil.repository;

import com.igorf08.consomeApiBrasil.model.CepModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CepRepository extends JpaRepository<CepModel, Long> {
    Optional<CepModel> findByCep(String cep);
}
