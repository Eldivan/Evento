package com.evento.repository;

import org.springframework.data.repository.CrudRepository;

import com.evento.model.Convidado;
import com.evento.model.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado , String> {
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
	
} 
