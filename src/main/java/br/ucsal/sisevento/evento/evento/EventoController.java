package br.ucsal.sisevento.evento.evento;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EventoController {
	
	//Autowired
	private final EventoService eventoService; 
	
	public EventoController(EventoService eventoService) {
		this.eventoService = eventoService;
	}
	
	
	@GetMapping("/eventos")
	public String eventos() {
		Collection<Evento> eventos = eventoService.obterEventos();
		StringBuilder builder = new StringBuilder();
		for (Evento strings : eventos) {
			builder.append(strings.toString());
			builder.append("<br>");
		}
		return builder.toString();
	}
}
