package com.idat.empresa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresario_empresa")
public class EmpresarioEmpresa {
	
	@Id
	private EmpresarioEmpresaFK fk = new EmpresarioEmpresaFK();

	public EmpresarioEmpresaFK getFk() {
		return fk;
	}

	public void setFk(EmpresarioEmpresaFK fk) {
		this.fk = fk;
	}
}
