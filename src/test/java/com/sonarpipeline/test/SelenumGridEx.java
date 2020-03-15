package com.sonarpipeline.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelenumGridEx {
	WebDriver driver;
	String baseUrl;
	String nodeUrl;

	@BeforeClass
	public void setup() throws MalformedURLException {
		baseUrl = "file:///C:/Users/kaustubh.aras/Desktop/JavaByKiran/Offline_Website/index.html";
		nodeUrl = "http://localhost:4444/wd/hub";
		DesiredCapabilities capabillities = DesiredCapabilities.chrome();
		capabillities.setBrowserName("chrome");
		driver = new RemoteWebDriver(new URL(nodeUrl), capabillities);
	}

	@AfterTest
	public void loginPageTest() {

		driver.quit();
	}

	@Test
	public void dashboardPageTest() {

		driver.get(baseUrl);
		Assert.assertEquals("JavaByKiran | Log in", driver.getTitle());
	}

}