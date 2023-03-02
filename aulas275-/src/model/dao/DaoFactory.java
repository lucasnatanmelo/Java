package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

/*
	DAO -> Data Access Object
	Gerencia a conexão com o data source para obter e armazenar informações
	É um padrão para aplicações implementadas com linguagens de programação orientada a objetos e arquitetura MVC
*/

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
