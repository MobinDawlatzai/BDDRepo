package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class Base {

	// this class will work as the parent class for all framework classes

	public static WebDriver driver;
	// properties will read the property

	public static Properties properties;

	// userDirectory: user direction to that path. user directory make it short.

	private String userDirectory = System.getProperty("user.dir");
	private String ppfile = "\\src\\test\\resources\\inputData\\projectProperty.properties";
	private String pathTopp = userDirectory + ppfile;
	public static Logger Logger;

	public Base() {

		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(pathTopp));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();

			} catch (FileNotFoundException e) {

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		Logger = Logger.getLogger("Logger_File");
		PropertyConfigurator.configure(".\\src\\test\\resources\\InputData\\log4j.properties");
	}

	public static String getBrowserName() {
		String browserName = properties.getProperty("browser");
		return browserName;

	}

	public static String getURL() {
		String url = properties.getProperty("url");
		return url;
	}

	public static long getImpWait() {
		String impWait = properties.getProperty("implicitlyWait");
		return Long.parseLong(impWait);
	}

	public static long getPLTimeOut() {
		String PLTimeOut = properties.getProperty("pageLoadTimeOut");
		return Long.parseLong(PLTimeOut);

	}

	public static void initializeDriver() {
		driver.get(getURL());
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}