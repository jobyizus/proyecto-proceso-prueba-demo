package com.yizuslabs.computador.servicio;

import java.util.List;

import com.yizuslabs.computador.modelo.ProductoBean;

public interface ProductoService {

	public ProductoBean guardarProducto(ProductoBean producto);

	public List<ProductoBean> obtenerProductos();

	public ProductoBean obtenerProductoPorCodigo(Long codProducto);

	public ProductoBean obtenerProductoPorCondicion(String descripcion);

	public Integer actualizarProducto(ProductoBean producto, Long codProducto);

	public void eliminarProducto(Long codProducto);

}
