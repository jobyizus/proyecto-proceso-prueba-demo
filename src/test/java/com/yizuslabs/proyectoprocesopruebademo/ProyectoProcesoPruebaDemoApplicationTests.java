package com.yizuslabs.proyectoprocesopruebademo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.yizuslabs.computador.base.BaseJobServer;
import com.yizuslabs.computador.controller.ProductoController;
import com.yizuslabs.computador.servicio.ProductoService;

public class ProyectoProcesoPruebaDemoApplicationTests {

	
	@Autowired
	private ProductoService productoService;
	//@Test
	public void contextLoads() {
	}
	
	//@Test
	public void testObtenerProductos() {
		Integer tamanio=0;
		System.out.println("objeto es "+productoService.obtenerProductos());
		if(productoService.obtenerProductos()!=null) {
			tamanio=productoService.obtenerProductos().size();
			if(tamanio>0) {
				System.out.println("tamanio es "+tamanio);
			}else {
				System.out.println("no existe datos");
			}		
		}else {
			System.out.println("objeto es nulo");
		}

		
	}

}
