package com.everis.beca.GestionPago.Solicitante.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.Solicitante.dto.AreaDTO;
import com.everis.beca.GestionPago.Solicitante.entity.areaEntity;
import com.everis.beca.GestionPago.Solicitante.repository.areaRepository;
import com.everis.beca.GestionPago.Solicitante.servic.areaService;

@Service
public class areaServiceImple implements  areaService {

	
	@Autowired
	areaRepository areaRepositorys;
	
	@Override
	public AreaDTO creadResolucion(AreaDTO AreaDto) {
		
		areaEntity areasEntitys = new areaEntity();
		areasEntitys.setId_area(AreaDto.getIdArea());
		areasEntitys.setNombreaArea(AreaDto.getNombreArea());
		areasEntitys.setCeco(AreaDto.getCeco());
		areasEntitys.setResponsable(AreaDto.getResponsable());
		areaRepositorys.save(areasEntitys);
		
		return AreaDto;
	}

}
