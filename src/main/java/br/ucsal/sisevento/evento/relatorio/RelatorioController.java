package br.ucsal.sisevento.evento.relatorio;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.sisevento.evento.evento.Evento;

@RestController
public class RelatorioController {
	
	
	@GetMapping("/campos")
	public List<String> campos() {
		Class<?> classe = Evento.class;
		Field[] fields =  classe.getDeclaredFields();
		List<String> campos = new ArrayList<String>();

		return campos;
	}
	
	
	public List<List<String>> valores() {
		return null;
	}
	
}
