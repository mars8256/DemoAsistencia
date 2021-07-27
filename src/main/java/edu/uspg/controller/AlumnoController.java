package edu.uspg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uspg.model.Alumno;
import edu.uspg.service.IAlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	private IAlumnoService service;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Alumno>> listar(){
		return new ResponseEntity<List<Alumno>>(service.listar(), HttpStatus.OK);
		
	}
	
	
	
	
	
}
