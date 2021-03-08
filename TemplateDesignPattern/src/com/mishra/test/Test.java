package com.mishra.test;

import com.mishra.factory.RecuirmentFactory;
import com.mishra.service.FresherRecuirment;

public class Test {

	
	public static void main(String[] args) {
		
		FresherRecuirment fresher= RecuirmentFactory.getResource("java");
		fresher.selectionDrive();
		
	}
}
