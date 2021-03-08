package com.mishra.test;

import com.mishra.dao.DAO;
import com.mishra.factory.DAOFactory;
import com.mishra.factory.DAOFactoryCreator;
import com.mishra.factory.DBDAOFactory;

public class Test {
	
	public static void main(String[] args) {
		
		DAOFactory factory= DAOFactoryCreator.getInstance("excel");
		DAO dao1= factory.createDAO("student");
		
		DAO dao2= factory.createDAO("course");
		
		dao1.insert();
		
		dao2.insert();
		
		
	}

}
