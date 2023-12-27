package com.autolib.pages;

import org.openqa.selenium.WebDriver;
import com.autolib.components.GlobalNavigation;

public class Home implements URL {

	private WebDriver driver;

	private GlobalNavigation globalNavigation;

	public Home(final WebDriver driver) {
		this.driver = driver;
		globalNavigation = new GlobalNavigation(driver);
	}

	@Override
	public void openURL() {
		this.driver.get("https://www.apple.com/ca/");
	}
	
	public GlobalNavigation getGlobalNavigation() {
		return globalNavigation;
	}

	

}
