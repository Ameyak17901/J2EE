package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {

	static Connection con;
	static PreparedStatement selprod,delprod;
	static {
		con = DBUtil.getMyConnection();
		try {
			selprod = con.prepareStatement("select * from product");
			delprod = con.prepareStatement("delete from product where id=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> plist = new ArrayList<>();
		try {
			ResultSet rs = selprod.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double price = rs.getDouble(3);
				int qty = rs.getInt(4);
				
				Product p = new Product(id,name,qty,price);
				plist.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return plist;
	}

	@Override
	public boolean deleteProduct(int pid) {
		try {
			delprod.setInt(1, pid);
			int n = delprod.executeUpdate();
			if(n>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
