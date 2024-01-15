package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Product> findProducts() {
		return jdbcTemplate.query("select * from product", (rs,num) -> {
			Product p = new Product();
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			return p;
		});
	}

}
