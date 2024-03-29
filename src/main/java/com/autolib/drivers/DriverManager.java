package com.autolib.drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	protected WebDriver driver;
	
	protected final String driverFilesFolderPath = "src/main/resources/drivers/";

	protected abstract void createDriver();

	public WebDriver getDriver() {
		if (null == driver) {
			createDriver();
		}
		return driver;
	}

	public void quitDriver() {
		if (null != driver) {
			driver.quit();
			driver = null;
		}
	}

}
