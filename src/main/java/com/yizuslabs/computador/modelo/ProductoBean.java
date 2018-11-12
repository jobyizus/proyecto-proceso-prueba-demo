package com.yizuslabs.computador.modelo;

import lombok.Data;

@Data
public class ProductoBean {

	private Long codProducto;
	private String desProducto;
	private Double precioProducto;
	private Integer stockProducto;
	private Integer codCategoria;
	
}
