package com.tutores_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutores_test.entity.Tutor;


@Repository
public interface ITutorRepository extends JpaRepository<Tutor, Integer>{

}
