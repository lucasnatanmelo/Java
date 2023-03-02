package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

/*
	SellerDao interface methods to be implemented
	CRUD -> Create, Read, Update, Delete
*/

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
