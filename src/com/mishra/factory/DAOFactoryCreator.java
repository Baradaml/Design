package com.mishra.factory;

public class DAOFactoryCreator {
	
	
	public  static DAOFactory getInstance(String type)
	{
		DAOFactory factory = null;
		if (type.equalsIgnoreCase("db")) {
			factory= new DBDAOFactory();
		}else if (type.equalsIgnoreCase("excel")) {
			factory= new ExcelDAOFactory();
		}else {
			throw new IllegalArgumentException("invalid selection");
		}
		return factory;
		
	}

}
