package com.everis.beca.GestionPago.Solicitante.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.Solicitante.dto.solicitanteDTO;
import com.everis.beca.GestionPago.Solicitante.entity.solicitanteEntity;
import com.everis.beca.GestionPago.Solicitante.repository.areaRepository;
import com.everis.beca.GestionPago.Solicitante.repository.solicitanteRepository;
import com.everis.beca.GestionPago.Solicitante.servic.solicitanteService;

@Service
public class solicitanteServiceImple implements solicitanteService {

	@Autowired
	solicitanteRepository solicitanteRepositorys;
	
	@Override
	public solicitanteDTO creadResolucion(solicitanteDTO solicitanteDto) {
		
		solicitanteEntity soliEntity = new solicitanteEntity();
		
		soliEntity.setArea_idArea(solicitanteDto.getArea_idArea());
		soliEntity.setCargo_idcargo(solicitanteDto.getCargo_idcargo());
		soliEntity.setEmail(solicitanteDto.getEmail());
		soliEntity.setIdSolicitante(solicitanteDto.getIdSolicitante());
		soliEntity.setNombreSolicitante(solicitanteDto.getNombreSolicitante());
		
		solicitanteRepositorys.save(soliEntity);
		
		return solicitanteDto;
	}

}
