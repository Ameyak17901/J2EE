package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{

	private ProductDao pdao;
	public ProductServiceImpl() {
		pdao = new ProductDaoImpl();
	}
	
	@Override
	public List<Product> getAllProducts() {
		return pdao.getAllProducts();
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.deleteProduct(pid);
	}

}
