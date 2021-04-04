package com.everis.beca.GestionPago.Solicitante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "aprovador")
public class aprovadorEntity {


	@Id
	@Column(name = "idaprovador")
	private String idaprovador;
	
	@Column(name = "nombre")
	private String nombre;
	
}
