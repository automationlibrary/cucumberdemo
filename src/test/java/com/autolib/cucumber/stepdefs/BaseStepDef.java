package com.autolib.cucumber.stepdefs;

import com.autolib.drivers.DriverManager;
import com.autolib.drivers.DriverType;
import com.autolib.factory.DriverManagerFactory;
import com.autolib.pages.Category;
import com.autolib.pages.Home;

public class BaseStepDef {

	DriverManager driverManager;
	
	Home home;
	
	Category category;

	protected void initializeDriver() {
		driverManager = DriverManagerFactory.getManager(DriverType.REMOTE_CHROME);
	}

	protected void tearDown() {
		driverManager.quitDriver();
	}

}
