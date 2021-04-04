package com.everis.beca.GestionPago.Solicitante.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.Solicitante.dto.cargoDTO;
import com.everis.beca.GestionPago.Solicitante.entity.cargoEntity;
import com.everis.beca.GestionPago.Solicitante.repository.cargoRepository;
import com.everis.beca.GestionPago.Solicitante.servic.cargoService;

@Service
public class cargoServiceImple implements cargoService{

	@Autowired
	cargoRepository cargoRepositorys;
	


	@Override
	public cargoDTO creadResolucion(cargoDTO cargoDto) {
		
		cargoEntity cargoEntitys = new cargoEntity();
		
		cargoEntitys.setIdcargo(cargoDto.getIdcargo());
		cargoEntitys.setCargo(cargoDto.getCargo());
		cargoRepositorys.save(cargoEntitys);		
		return cargoDto;
	}

	
}
