package com.idat.empresa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.empresa.model.Empresa;
import com.idat.empresa.service.EmpresaService;

public class EmpresaController {

private EmpresaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Empresa> listar(){
		return service.listar();
	}

	@GetMapping("/listar/{id}")
	public @ResponseBody Empresa obtener(@PathVariable Integer id) {
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public  ResponseEntity<Void> guardar(@RequestBody Empresa empresa) {
		service.guardar(empresa);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Empresa empresa) {
		service.actualizar(empresa);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
}
