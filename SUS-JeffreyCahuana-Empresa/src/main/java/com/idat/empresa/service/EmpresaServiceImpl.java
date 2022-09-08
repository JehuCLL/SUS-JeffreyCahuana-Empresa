package com.idat.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.empresa.model.Empresa;
import com.idat.empresa.repository.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService{
	
	@Autowired
	private EmpresaRepository repository;
	
	@Override
	public List<Empresa> listar() {
		return repository.findAll();
	}

	@Override
	public Empresa obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Empresa empresa) {
		repository.save(empresa);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Empresa empresa) {
		repository.saveAndFlush(empresa);
	}

}
