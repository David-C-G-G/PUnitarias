package com.tutores_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutores_test.entity.Tutor;
import com.tutores_test.impl.TutorLogic;
import com.tutores_test.request.TutorRequest;


@RestController
@RequestMapping("tutores")
public class TutorController {
	
	@Autowired
	TutorLogic service;
	
	@GetMapping("mostrar")
	// http://localhost:8090/tutores/mostrar
	public ResponseEntity <List<Tutor>> mostrar() {
		List<Tutor> lista = service.mostrar();
		return new ResponseEntity<List<Tutor>>(lista, HttpStatus.OK);
	}
	
	@PostMapping("guardar")
	// http://localhost:8090/tutores/guardar
	public ResponseEntity<Tutor> guardar(@RequestBody TutorRequest request){
		Tutor tutor = service.guardar(request);
		return new ResponseEntity<Tutor>(tutor, HttpStatus.OK);
	}
	
	@PutMapping("editar")
	// http://localhost:8090/tutores/editar
	public ResponseEntity<Tutor> editar(@RequestBody TutorRequest request){
		Tutor tutor = service.editar(request);
		return new ResponseEntity<Tutor>(tutor, HttpStatus.OK);
	}
	
	@GetMapping("buscar/{id}")
	// http://localhost:8090/tutores/buscar/5
	public ResponseEntity<Tutor> buscar(@PathVariable int id){
		Tutor tutor = service.buscar(id);
		return new ResponseEntity<Tutor>(tutor, HttpStatus.OK);
	}
	
	@DeleteMapping("eliminar/{id}")
	// http://localhost:8090/tutores/eliminar/10
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String tutor = service.eliminar(id);
		return new ResponseEntity<String>(tutor, HttpStatus.OK);
	}

}
