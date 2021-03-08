package com.mishra.factory;

import com.mishra.dao.DAO;

public interface DAOFactory {
	
  public DAO createDAO(String type);
	
}
