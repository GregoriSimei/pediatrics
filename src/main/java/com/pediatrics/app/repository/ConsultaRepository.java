package com.pediatrics.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.pediatrics.app.model.Consulta;

public interface ConsultaRepository extends CrudRepository<Consulta, String>{
	Consulta findById(Long id);
}
