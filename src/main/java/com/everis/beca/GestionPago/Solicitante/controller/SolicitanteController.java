package com.everis.beca.GestionPago.Solicitante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beca.GestionPago.Solicitante.dto.AreaDTO;
import com.everis.beca.GestionPago.Solicitante.dto.aprovadorDTO;
import com.everis.beca.GestionPago.Solicitante.dto.cargoDTO;
import com.everis.beca.GestionPago.Solicitante.dto.json;
import com.everis.beca.GestionPago.Solicitante.dto.solicitanteDTO;
import com.everis.beca.GestionPago.Solicitante.servic.aprovadorService;
import com.everis.beca.GestionPago.Solicitante.servic.areaService;
import com.everis.beca.GestionPago.Solicitante.servic.cargoService;
import com.everis.beca.GestionPago.Solicitante.servic.solicitanteService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/solicitante")
public class SolicitanteController {
	public String cargo;
	public Integer id;
	public String Idaprovador;
	public Integer idArea;
	public String nombreaArea;
	public String responsable;
	public String ceco;
	public Integer idSolicitante;
	public Integer cargo_idcargo;
	public Integer area_idArea;
	public String email;
	public String nombreSolicitante;
	
	@Autowired
	private cargoService cargoServicios;
	@Autowired
	private aprovadorService aprovServicios;
	@Autowired
	private areaService areaServicios;
	@Autowired
	private solicitanteService solicitanteServicios;
	

	@RequestMapping(value = "/cargo" , method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> PostCargo(@RequestBody json Json) {
	
		id = Json.getId();
		cargo = Json.getCargo(); 
		cargoDTO cargoDto = new cargoDTO();
		
		cargoDto.setIdcargo(id);
		cargoDto.setCargo(cargo);
		
		cargoServicios.creadResolucion(cargoDto);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/aprovador" , method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> PostAprovador(@RequestBody json Json) {
	
		Idaprovador = Json.getIdaprovador();
		cargo = Json.getNombre(); 
		aprovadorDTO aprovDto = new aprovadorDTO();
		aprovDto.setIdaprovador(Idaprovador);
		aprovDto.setNombre(cargo);
		aprovServicios.creadResolucion(aprovDto);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/area" , method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> PostArea(@RequestBody json Json) {
	
		Idaprovador = Json.getIdaprovador();
		cargo = Json.getNombre(); 
		AreaDTO areaDto = new AreaDTO();
		idArea = Json.getIdArea();
		ceco  = Json.getCeco();
		nombreaArea= Json.getNombreaArea();
		responsable = Json.getResponsable();
		
		areaDto.setIdArea(idArea);
		areaDto.setCeco(ceco);
		areaDto.setNombreArea(nombreaArea);
		areaDto.setResponsable(responsable);
		
		areaServicios.creadResolucion(areaDto);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/solicitante" , method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> PostSolicitante(@RequestBody json Json) {
	

		idSolicitante = Json.getIdSolicitante();
		cargo_idcargo = Json.getCargo_idcargo();
		area_idArea = Json.getArea_idArea();
		email = Json.getEmail();
		nombreSolicitante = Json.getNombreSolicitante();
		
		solicitanteDTO solicitanteDto = new solicitanteDTO();
	
		Idaprovador = Json.getIdaprovador();
		cargo = Json.getNombre(); 
		
		solicitanteDto.setIdSolicitante(idSolicitante);
		solicitanteDto.setCargo_idcargo(cargo_idcargo);
		solicitanteDto.setArea_idArea(area_idArea);
		solicitanteDto.setEmail(email);
		solicitanteDto.setNombreSolicitante(nombreSolicitante);
		
		solicitanteServicios.creadResolucion(solicitanteDto);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
	
}
