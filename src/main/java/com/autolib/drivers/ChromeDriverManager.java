package com.autolib.drivers;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.chrome.driver", driverFilesFolderPath + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

}
