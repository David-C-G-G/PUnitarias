package com.tutores_test.service;

import java.util.List;

import com.tutores_test.entity.Tutor;
import com.tutores_test.request.TutorRequest;


public interface ITutorService {
	
	public Tutor guardar(TutorRequest request);
	
	public Tutor editar(TutorRequest request);
	
	public Tutor buscar(int id);
	
	public String eliminar(int id);
	
	public List<Tutor> mostrar();

}
