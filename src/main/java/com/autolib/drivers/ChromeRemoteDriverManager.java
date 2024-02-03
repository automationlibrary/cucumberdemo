package com.autolib.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeRemoteDriverManager extends DriverManager {

		@Override
		protected void createDriver() {
			Capabilities chromeOptions = new ChromeOptions();
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

}
