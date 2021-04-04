package com.everis.beca.GestionPago.Solicitante.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class json implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String Cargo;
	private String idaprovador;
	private String nombre;
	private Integer idArea;
	private String nombreaArea;
	private String responsable;
	private String ceco;
	private Integer idSolicitante;
	private Integer cargo_idcargo;
	private Integer area_idArea;
	private String email;
	private String nombreSolicitante;
	

}
