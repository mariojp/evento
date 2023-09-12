package br.ucsal.sisevento.evento.evento;

import java.util.Collection;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class EventoService {
	

	private final EventoRepository eventoRepository;
	
	
	public EventoService(EventoRepository eventoRepository) {
		this.eventoRepository = eventoRepository;
	}
	
	public Collection<Evento> obterEventos() {
		return eventoRepository.findAll();
	}
}
