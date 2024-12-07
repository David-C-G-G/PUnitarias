package com.tutores_test.entity;

import java.io.Serializable;
// import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TUTORES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tutor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aid_auto")
	@SequenceGenerator(name = "aid_auto", sequenceName = "TUTOR_SEQ", allocationSize = 1)
	@Column(name = "TUTOR_ID", columnDefinition = "NUMBER")
	private int tutorId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(30)")
	private String nombre;
	@Column(name = "EMAIL", columnDefinition = "NVARCHAR2(30)")
	private String email;
	@Column(name = "CLAVE", columnDefinition = "NVARCHAR2(1)")
	private String clave;

}
