package com.everis.beca.GestionPago.Solicitante.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.Solicitante.dto.aprovadorDTO;
import com.everis.beca.GestionPago.Solicitante.entity.aprovadorEntity;
import com.everis.beca.GestionPago.Solicitante.repository.aprovadorRepository;
import com.everis.beca.GestionPago.Solicitante.servic.aprovadorService;

@Service
public class aprovadorServiceImple implements aprovadorService{

	@Autowired
	aprovadorRepository aprovadorRepositorys;
	
	@Override
	public aprovadorDTO creadResolucion(aprovadorDTO aprovadorDto) {
		
		aprovadorEntity aprovEntity = new aprovadorEntity();
		aprovEntity.setIdaprovador(aprovadorDto.getIdaprovador());
		aprovEntity.setNombre(aprovadorDto.getNombre());
		
		aprovadorRepositorys.save(aprovEntity);
		
		return aprovadorDto;
	}

}
