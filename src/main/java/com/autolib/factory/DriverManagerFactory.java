package com.autolib.factory;

import com.autolib.drivers.ChromeDriverManager;
import com.autolib.drivers.ChromeRemoteDriverManager;
import com.autolib.drivers.DriverManager;
import com.autolib.drivers.DriverType;

public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager;
		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case REMOTE_CHROME:
			driverManager = new ChromeRemoteDriverManager();
			break;	
		case FIREFOX:
			throw new RuntimeException("To Implement : Firefox Driver");
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return driverManager;
	}

}
