package com.idat.empresa.service;

import java.util.List;

import com.idat.empresa.model.Empresa;

public interface EmpresaService {
	List<Empresa> listar();
	Empresa obtenerId(Integer id);
	void guardar(Empresa empresa);
	void eliminar(Integer id);
	void actualizar(Empresa empresa);
}
