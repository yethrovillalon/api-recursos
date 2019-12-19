package cl.yet.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.yet.system.dto.Recurso;
import cl.yet.system.service.IRecursoService;

@RestController
public class RecursoController {

	@Autowired
	IRecursoService recursoService;
	
	@GetMapping("")
	public List<Recurso> getRecursos(){
		return recursoService.getRecursoAll();
	}
}
