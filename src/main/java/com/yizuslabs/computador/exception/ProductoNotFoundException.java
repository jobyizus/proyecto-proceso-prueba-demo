package com.yizuslabs.computador.exception;

public class ProductoNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ProductoNotFoundException(Long id) {
		super("No se puede encontrar producto " + id);
	}
	
	ProductoNotFoundException() {
		super("No existen productos ");
	}

}
