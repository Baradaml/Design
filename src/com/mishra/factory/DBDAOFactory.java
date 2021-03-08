package com.mishra.factory;

import com.mishra.dao.DAO;
import com.mishra.dao.DBCourseDAO;
import com.mishra.dao.DBStudnetDAO;

public class DBDAOFactory  implements DAOFactory{

	@Override
	public DAO createDAO(String type) {
		
		DAO dao = null;
		
		if (type.equalsIgnoreCase("student")) {
			dao= new DBStudnetDAO();
		}else if (type.equalsIgnoreCase("course")) {
			dao= new DBCourseDAO();
		}else
		{
			throw new IllegalArgumentException("invalid selection");
		}
		return dao;
	}

}
