package com.idat.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.empresa.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{
	
}
