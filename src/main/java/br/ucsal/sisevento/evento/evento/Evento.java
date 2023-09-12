package br.ucsal.sisevento.evento.evento;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "eventos")
public class Evento implements Comparable<Evento>  {
	
	//DDL
	//DML
	@Id
	private Integer id;
	
	private String tipo;
	
	private String titulo;
	
	//
	public Evento() {
	
	}
	
	public Evento(String tipo, String titulo) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evento [tipo=").append(tipo).append(", titulo=").append(titulo).append("]");
		return builder.toString();
	}
	
	@Override
	public int hashCode() {
		return this.titulo.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Evento e = (Evento) obj;
		return e.titulo.equals(this.titulo);
	}
	@Override
	public int compareTo(Evento o) {
		int re = this.tipo.compareTo(o.tipo);
		if (re == 0) {
			re = this.titulo.compareTo(o.titulo);
		}
		return re;
	}
	
}