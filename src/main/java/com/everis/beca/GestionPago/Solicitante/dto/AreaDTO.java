package com.everis.beca.GestionPago.Solicitante.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class AreaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	

	private Integer idArea;
	private String nombreArea;
	private String responsable;
	private String ceco;

}
