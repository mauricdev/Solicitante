package com.everis.beca.GestionPago.Solicitante.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class aprovadorDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idaprovador;
	private String nombre;

}
