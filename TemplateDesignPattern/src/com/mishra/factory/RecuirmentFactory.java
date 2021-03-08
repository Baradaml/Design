package com.mishra.factory;

import com.mishra.service.Cfresher;
import com.mishra.service.DotNetFresher;
import com.mishra.service.FresherRecuirment;
import com.mishra.service.JavaFresher;

public class RecuirmentFactory {

	
	public static FresherRecuirment getResource(String type)
	{
		FresherRecuirment rec= null;
		if (type.equalsIgnoreCase("java")) {
		rec= new JavaFresher();	
		}else if (type.equalsIgnoreCase(".net")) {
			rec=new DotNetFresher();
		}else if (type.equalsIgnoreCase("C")) {
			rec= new Cfresher();
		}else{
			throw new IllegalArgumentException("invalid selection");
		}
		return rec;
	}
	
	
}
