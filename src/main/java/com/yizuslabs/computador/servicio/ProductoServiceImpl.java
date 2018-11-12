package com.yizuslabs.computador.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yizuslabs.computador.dao.spring.ProductoRepository;
import com.yizuslabs.computador.modelo.ProductoBean;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	 @Autowired
	 private ProductoRepository productoRepository;
	  

	@Override
	public ProductoBean guardarProducto(ProductoBean producto) {
		// TODO Auto-generated method stub
		return productoRepository.guardarProducto(producto);
	}

	@Override
	public List<ProductoBean> obtenerProductos() {
		// TODO Auto-generated method stub
		return productoRepository.obtenerProductos();
	}

	@Override
	public ProductoBean obtenerProductoPorCodigo(Long codProducto) {
		// TODO Auto-generated method stub
		return productoRepository.obtenerProductoPorCodigo(codProducto);
	}

	@Override
	public ProductoBean obtenerProductoPorCondicion(String descripcion) {
		// TODO Auto-generated method stub
		return productoRepository.obtenerProductoPorCondicion(descripcion);
	}

	@Override
	public Integer actualizarProducto(ProductoBean producto, Long codProducto) {
		// TODO Auto-generated method stub
		return productoRepository.actualizarProducto(producto,codProducto);
	}

	@Override
	public void eliminarProducto(Long codProducto) {
		productoRepository.eliminarProducto(codProducto);
		// TODO Auto-generated method stub
		
	}

}
