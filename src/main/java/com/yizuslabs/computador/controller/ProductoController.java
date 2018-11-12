package com.yizuslabs.computador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yizuslabs.computador.modelo.ProductoBean;
import com.yizuslabs.computador.servicio.ProductoService;

@RestController
@RequestMapping("/v1/yanaca")
public class ProductoController {

	private final ProductoService productoService;

	@Autowired
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}

	@GetMapping("/producto")
	public List<ProductoBean> obtenerProductos() {
		return productoService.obtenerProductos();
	}

	@GetMapping("/producto/{codproducto}")
	public ProductoBean obtenerProductoPorCodigo(@PathVariable Long codProducto) {
		return productoService.obtenerProductoPorCodigo(codProducto);
	}
	
	@GetMapping("/producto/{descripcion}")
	public ProductoBean obtenerProductoPorCondicion(@PathVariable String descripcion) {
		return productoService.obtenerProductoPorCondicion(descripcion);
	}

	@PostMapping("/producto")
	public ProductoBean guardarProducto(@RequestBody ProductoBean producto) {
		return productoService.guardarProducto(producto);
	}
	
	@PutMapping("/producto/{codproducto}")
	public Integer actualizarProducto(@RequestBody ProductoBean producto, @PathVariable Long codProducto) {

		return productoService.actualizarProducto(producto,codProducto);
	}
	
	@DeleteMapping("/producto/{codproducto}")
	public void eliminarProducto(@PathVariable Long codProducto) {
		productoService.eliminarProducto(codProducto);
	}
	
	

}
