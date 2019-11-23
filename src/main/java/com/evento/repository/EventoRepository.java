package com.evento.repository;

import org.springframework.data.repository.CrudRepository;

import com.evento.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);
}
