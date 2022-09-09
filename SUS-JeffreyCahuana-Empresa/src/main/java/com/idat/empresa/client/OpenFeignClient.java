package com.idat.empresa.client;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeingClient(name="idat-empresario", url="localhost:8888")
public interface OpenFeignClient {
	@GetMapping("/api/empresario/v1/listar")
	public List<Empresario> ListadoEmpresario();
}
