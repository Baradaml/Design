package com.mishra.service;

public abstract class FresherRecuirment {
	
	public boolean apptitudeTest()
	{
		System.out.println("FresherRecuirment.apptitudeTest()");
		return true;
	}
	
	public boolean gdTest()
	{
		System.out.println("FresherRecuirment.gdTest()");
		return true;
	}
	
	public abstract boolean technicalInterview();
	
	public abstract boolean hrInterview();
	
	public void selectionDrive()
	{
		boolean flag= false;
		if (apptitudeTest()==true) {
			if (gdTest()) {
//             flag= true;
				if (technicalInterview()) {
//					flag= true;
					if (hrInterview()) {
						flag= true;
							}
				}
			}}
		if (flag) {
			System.out.println("candidate selected for company ,All the BEST!!!");
			
		}else {
			System.out.println("Candidate not selected , Keep on trying u will get the  better opperyunity soon");
		}
	}


}
