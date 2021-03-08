package com.mishra.factory;

import com.mishra.dao.DAO;
import com.mishra.dao.ExcelCourseDAO;
import com.mishra.dao.ExcelStudentDAO;

public class ExcelDAOFactory  implements DAOFactory{

	@Override
	public DAO createDAO(String type) {
		DAO dao=null;
		if (type.equalsIgnoreCase("student")) {
			dao= new  ExcelStudentDAO();
		}else if (type.equalsIgnoreCase("course")) {
			dao= new ExcelCourseDAO();
		}else{
			throw new IllegalArgumentException("invalid selection");
		}
		
		return dao;
	}

}
