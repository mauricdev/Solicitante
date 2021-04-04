package com.everis.beca.GestionPago.Solicitante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cargo")
public class cargoEntity {

	@Id
	@Column(name = "idcargo")
	private Integer idcargo;
	
	@Column(name = "cargo")
	private String cargo;
}
