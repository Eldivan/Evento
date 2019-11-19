package com.evento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.evento.model.Evento;
import com.evento.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository er;
	
	@RequestMapping(value="/cadastrarEvento",method=RequestMethod.GET)
	public String form() {
		return "formEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento",method=RequestMethod.POST)
	public String form(Evento evento) {
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}
	
}
