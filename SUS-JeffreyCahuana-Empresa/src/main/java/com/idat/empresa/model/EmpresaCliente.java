package com.idat.empresa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa_cliente")
public class EmpresaCliente {
	
	@Id
	private EmpresaClienteFK fk = new EmpresaClienteFK();

	public EmpresaClienteFK getFk() {
		return fk;
	}

	public void setFk(EmpresaClienteFK fk) {
		this.fk = fk;
	}
	
}
