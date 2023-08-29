package br.ucsal.sisevento.evento.evento;

import java.util.Collection;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EventoController {
	
	

	
	
	@GetMapping("/eventos")
	public String eventos() {
		Collection<Evento> eventos = new  EventoService().obterEventos();
		StringBuilder builder = new StringBuilder();
		for (Evento strings : eventos) {
			builder.append(strings.toString());
			builder.append("<br>");
		}
		return builder.toString();
	}
}
