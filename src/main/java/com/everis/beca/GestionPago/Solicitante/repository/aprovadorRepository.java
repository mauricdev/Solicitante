package com.everis.beca.GestionPago.Solicitante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.beca.GestionPago.Solicitante.entity.aprovadorEntity;

@Repository
public interface aprovadorRepository extends JpaRepository<aprovadorEntity, String>{

}
