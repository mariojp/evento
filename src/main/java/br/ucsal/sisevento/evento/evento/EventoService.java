package br.ucsal.sisevento.evento.evento;

import java.util.Collection;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

public class EventoService {
	
	private Collection<Evento> eventos = new TreeSet<>();

	
	protected Collection<Evento> obterEventos() {
		eventos.add(new Evento("Mesa Redonda 1","IA"));
		eventos.add(new Evento("Mesa Redonda 1","IA"));
		eventos.add(new Evento("Mesa Redonda 1","IA"));
		eventos.add(new  Evento("Mesa Redonda 2","WEB"));
		eventos.add(new Evento("Mesa Redonda 2","BIG NOTATIONS"));
		return eventos;
	}
}
