package com.everis.beca.GestionPago.Solicitante.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "area")
public class areaEntity {

	@Id
	@Column(name = "idarea")
	private Integer id_area;
	
	@Column(name = "nombreaarea")
	private String nombreaArea;
	
	@Column(name = "responsable")
	private String responsable;
	
	@Column(name = "ceco")
	private String ceco;
}
