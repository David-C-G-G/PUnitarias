package com.tutores_test.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TutorRequest {

	private int tutorId;
	private String nombre;
	private String email;
	private String clave;
	
//	public TutorRequest() {}
//
//	public TutorRequest(int tutorId, String nombre, String email, String clave) {
//		super();
//		this.tutorId = tutorId;
//		this.nombre = nombre;
//		this.email = email;
//		this.clave = clave;
//	}
//
//	public int getTutorId() {
//		return tutorId;
//	}
//
//	public void setTutorId(int tutorId) {
//		this.tutorId = tutorId;
//	}
//
//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getClave() {
//		return clave;
//	}
//
//	public void setClave(String clave) {
//		this.clave = clave;
//	}
//
//	@Override
//	public String toString() {
//		return "TutorRequest [tutorId=" + tutorId + ", nombre=" + nombre + ", email=" + email + ", clave=" + clave
//				+ "]";
//	}
	
	
}
