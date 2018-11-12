package com.yizuslabs.computador.dao.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.yizuslabs.computador.modelo.ProductoBean;

@Repository
public class ProductoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public ProductoBean guardarProducto(ProductoBean producto) {
		// TODO Auto-generated method stub

		final String sql = "insert into users(name,email) values(?,?)";

		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, producto.getDesProducto());
				ps.setDouble(2, producto.getPrecioProducto());
				ps.setInt(3, producto.getStockProducto());
				return ps;
			}
		}, holder);

		Long codProducto = (long) holder.getKey().intValue();
		producto.setCodProducto(codProducto);
		return producto;

	}

	public List<ProductoBean> obtenerProductos() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from productos", new ProductoRowMapper());

	}

	public ProductoBean obtenerProductoPorCodigo(Long codProducto) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from users where id=?", new Object[] { codProducto },
				new ProductoRowMapper());
	}

	public ProductoBean obtenerProductoPorCondicion(String descripcion) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer actualizarProducto(ProductoBean producto, Long codProducto) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
				"update productos " + " set desproducto = ?, stockproducto = ? " + " where codproducto = ?",
				new Object[] { producto.getDesProducto(), producto.getStockProducto(), codProducto });
	}

	public void eliminarProducto(Long codProducto) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from productos where codproducto=?", new Object[] { codProducto });
	}

	// Class RowMapper
	class ProductoRowMapper implements RowMapper<ProductoBean>

	{

		public ProductoBean mapRow(ResultSet rs, int rowNum) throws SQLException {

			ProductoBean producto = new ProductoBean();
			producto.setCodProducto(rs.getLong("id"));
			producto.setDesProducto(rs.getString("name"));
			producto.setStockProducto(rs.getInt("email"));
			producto.setPrecioProducto(rs.getDouble("email"));

			return producto;

		}

	}

}
