package com.everis.beca.GestionPago.Solicitante.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class solicitanteDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	

	private Integer idSolicitante;
	private String nombreSolicitante;
	private String email;
	private Integer cargo_idcargo;
	private Integer area_idArea;

}
