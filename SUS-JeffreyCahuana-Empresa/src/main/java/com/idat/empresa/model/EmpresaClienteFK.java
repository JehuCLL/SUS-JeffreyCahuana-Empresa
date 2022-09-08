package com.idat.empresa.model;

import javax.persistence.Embeddable;

@Embeddable
public class EmpresaClienteFK {
	
	private Integer idcliente;
	private Integer idempresa;
	
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public Integer getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
	}
	
	
}
