package com.mishra.service;

public class DotNetFresher extends FresherRecuirment{

	@Override
	public boolean technicalInterview() {
System.out.println("DotNetFresher.technicalInterview()");
		return false;
	}

	@Override
	public boolean hrInterview() {

		System.out.println("DotNetFresher.hrInterview()");
		return false;
	}

}
