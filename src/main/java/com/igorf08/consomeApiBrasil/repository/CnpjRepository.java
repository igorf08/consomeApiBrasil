package com.igorf08.consomeApiBrasil.repository;

import com.igorf08.consomeApiBrasil.model.CnpjModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CnpjRepository extends JpaRepository<CnpjModel, Long> {
    Optional<CnpjModel> findByCnpj (String cnpj);
}
