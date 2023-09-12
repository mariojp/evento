package br.ucsal.sisevento.evento.evento;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface EventoRepository extends Repository<Evento, Integer>{
	
	List<Evento> findAll();

	
	
	
}
