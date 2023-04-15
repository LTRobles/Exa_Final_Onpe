package com.onpe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpe.model.GrupoVotacion;
import com.onpe.repository.IGrupoVotacion;

@Service
public class GrupoVotacionServiceImp implements IGrupoVotacionService{
@Autowired
IGrupoVotacion iGrupoVotacion;
@Override
public 	GrupoVotacion getGrupoVotacion(String id) {
	
	return iGrupoVotacion.getGrupoVotacion(id);
}

}