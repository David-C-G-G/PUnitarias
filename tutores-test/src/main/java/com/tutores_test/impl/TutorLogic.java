package com.tutores_test.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutores_test.entity.Tutor;
import com.tutores_test.repository.ITutorRepository;
import com.tutores_test.request.TutorRequest;
import com.tutores_test.service.ITutorService;


@Service
public class TutorLogic implements ITutorService{
	
	@Autowired
	ITutorRepository dao;

	@Override
	public Tutor guardar(TutorRequest request) {
		Tutor tutor = new Tutor();
		
		tutor.setNombre(request.getNombre());
		tutor.setEmail(request.getEmail());
		tutor.setClave(request.getClave());
		
		dao.save(tutor);

		return tutor;
	}

	@Override
	public Tutor editar(TutorRequest request) {
		Tutor tutor = dao.findById(request.getTutorId()).get();
		
		// Editamos sus valores
		tutor.setNombre(request.getNombre());
		tutor.setEmail(request.getEmail());
		tutor.setClave(request.getClave());
		dao.save(tutor);
		
		return tutor;
	}

	@Override
	public Tutor buscar(int id) {
		Tutor tutor = dao.findById(id).get();
		return tutor;
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);// se identifica al alumno en la BD y se elimina
		return "Registro eliminado correctamente";
	}

	@Override
	public List<Tutor> mostrar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
