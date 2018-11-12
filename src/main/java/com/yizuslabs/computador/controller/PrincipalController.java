package com.yizuslabs.computador.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yizuslabs.computador.modelo.PrincipalBean;

public class PrincipalController {
	
	private static final String template="Hello, %s!";
	
	@RequestMapping("/greeting/{name}")
	public PrincipalBean bienvenidoJobAplicativo(@PathVariable("name") String name) {
		return new PrincipalBean(String.format(template,name));
	}
	

} 
