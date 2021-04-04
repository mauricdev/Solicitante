package com.everis.beca.GestionPago.Solicitante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "solicitante")
public class solicitanteEntity {

	@Id
	@Column(name = "idsolicitante")
	private Integer idSolicitante;
	
	@Column(name = "nombresolicitante")
	private String nombreSolicitante;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "cargo_idcargo")
	private Integer cargo_idcargo;

	@Column(name = "area_idarea")
	private Integer area_idArea;

}
